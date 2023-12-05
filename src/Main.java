import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//simple test for showing some string formatting
        String in = JOptionPane.showInputDialog("Hvor mange er vi");
     final String favorittspraak = "java";
        try {
           int deltagere =  Integer.parseInt(in);
            System.out.println("Velkommmen til kræsjkurs \nvi var \n" + deltagere + " på kuset i 2023 \n" + "Ja vi elsker " + favorittspraak);
        }catch (Exception e){
            System.out.println("Her var det feilen " + e);
        }

    }
}