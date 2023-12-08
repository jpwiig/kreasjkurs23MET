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
        Bil bilmedmangehjul = new Bil("Burgunderblå metallic", 2007, 8);
        System.out.println(bilmedmangehjul.toString());
    }
}
