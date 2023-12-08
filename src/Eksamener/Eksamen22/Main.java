package Eksamener.Eksamen22;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Eksamen 2022 15-18
public class Main {
    public static void main(String[] args) {
        //Oppgave 1
        int[] Oppgave1Array = {-3, 41, 5, -3, 2, 49}; //Array til oppgave 1
        //a)
        //Antagelse: vi skal ha antall som er større enn 10:
        int storrreEnn10 = 0;
        for (int i = 0; i <= Oppgave1Array.length - 1; i++) {
            if (Oppgave1Array[i] > 10) storrreEnn10++;
        }
        System.out.println("Antall som er større en 10 er: " + storrreEnn10);
        System.out.println("Oppgave 1 b:  ");
        //b) Annenhvert elemenent i arrayet:
        //[-3, 5, 2] hopper med 2:
        int inkrement = 0;
        while (inkrement < Oppgave1Array.length) {
            System.out.print(Oppgave1Array[inkrement] + " ");
            inkrement += 2;
        }
        //Oppgave c print ut alle positive tall i Arrayet sin totale sum /gjennomsnitt
        int sum = 0;
        int i = 0;
        int avgPos = 0;
        double gjennomsnitt = 0;
        for (; i <= Oppgave1Array.length - 1; i++) {
            if (Oppgave1Array[i] >= 0) {
                sum += Oppgave1Array[i];
                avgPos++;
            }
        }
        gjennomsnitt = (double) sum / avgPos;
        System.out.println("Summen av Alle positive Tall er: " + sum);
        System.out.println("Gjennomsnittet av Alle positive tall er: " + gjennomsnitt);
        //Oppgave 2
        // se Liste klassen
        //Oppgave 3
        //Formel for BMI: (1.3 * vekt) /((høyde/100)²·⁵)
        //math.pow
        try{
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn vekt: "));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn høyden"));
        double num = 2.5;
        double sum1 = (1.3 * weight) /  (Math.pow((height/100), num));
        String ut = "BMI: "   + String.format("%.2f", sum1 );
        JOptionPane.showMessageDialog(null, ut);
        }catch (Exception E){
            System.out.println("Feil: " + E);
        }
        //Oppgave 4
        KonvertertTemperatur tilTemp = new KonvertertTemperatur(25, 105);
        System.out.println(tilTemp.returnerCelciusOgFarenHeit());
        //Oppgave 5
        List<Bok>boker = new ArrayList<>();
        Papirbok bok1= new Papirbok("Harry Potter", "J.K Rowling", 150, 100);
        Papirbok bok2= new Papirbok("The Hunger Games", "Suzanna Collins", 80, 100);
        //legger til bøker
        boker.add(bok1);
        boker.add(bok2);

        Lydbok lydbok1 = new Lydbok("Venizamysteriet", "ja", 300, 600);
        Lydbok lydbok2 = new Lydbok("Kul lydbok", "kulforfatter", 300, 8);

        boker.add(lydbok1);
        boker.add(lydbok2);

        //foreach for å printe ut:
        for (Bok boken :  boker) System.out.println(boken.toString());

    }
}
