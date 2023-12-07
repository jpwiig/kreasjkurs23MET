package Forklaringer.ArvOgPolyformisme;

import java.util.List;

//Dette interfacet skal vi implementere i dag
public interface ExampleInterface {
    public int returnAnumber(int number);
    public void popUpBox(String innput);
    public int[]returnArray (int[] NumberArray);
    //Jeg kaller på "interface" til ArrayList, dette er av vane, og jeg personlig syns det er mer ryddig, vi kommer til å implementere en ArrayList i de som kaller på en List, PLUSS SÅ PASSER KODEN TIL MER!!
    public List<Integer> AListOfNumbers(List<Integer>IntegerList);
    public List<String> AListOfStrings(List<String>stringList);
    public <T> List<T> somthingList(List<T>Genericlist);  //generisk -> Dette er ikke så veldig pensum relatert for dere i pensum nå, men er en spennende måte å progge på, pluss dette kommer senere i løpet, så vil at dere skal ivhvertfall være kjent med syntaksen
 }
