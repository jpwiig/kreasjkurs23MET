package Forklaringer.ArvOgPolyformisme;


import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
    ImplementationOfInterFace ex = new ImplementationOfInterFace();
    int [] a = {1,2,3,4,5,6,7,8};
        System.out.println(ex.returnArray(a));
        List <String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        ex.AListOfStrings(stringList);
        List<Integer> intList= new ArrayList<>();
        intList.add(1);
        intList.add(1);
        intList.add(2);
        intList.add(2);
        ex.somthingList(intList); //<- denne kan være hvilken som helst liste da <T> er generisk og kan være hva som helst
        Bil bilmedmangehjul = new Bil("Burgunderblå metallic", 2007, 8);
        System.out.println(bilmedmangehjul.toString());
    }
}
