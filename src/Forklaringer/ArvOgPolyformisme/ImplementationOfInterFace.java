package Forklaringer.ArvOgPolyformisme;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ImplementationOfInterFace implements ExampleInterface {
    public int returnAnumber(int number){
        return number;
    }
    public void popUpBox(String innput){
        JOptionPane.showMessageDialog(null, innput);
    }
    public int [] returnArray(int[] numberArray){
       for (int i : numberArray) System.out.print(i);
        return numberArray;
    }

    public List<Integer> AListOfNumbers (List<Integer>IntegerList){
        return IntegerList;
    }
    public List <String> AListOfStrings(List<String>stringList){
        System.out.println("List has been added!");
        for (String s : stringList) System.out.println(s + " ");
        return stringList;
    }
    public <T> List<T>somthingList(List<T>Genericlistlist){
        return Genericlistlist;
    }
}
