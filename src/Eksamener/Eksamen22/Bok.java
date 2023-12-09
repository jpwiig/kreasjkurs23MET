package Eksamener.Eksamen22;

public class Bok { //Superklassen til lydbok og papirbok
    private String tittel;
    private String forfatter;
    private Double pris;

    public Bok(String tittel, String forfatter, Double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    @Override
    public String toString(){
        String ut = "Tittle: " +  tittel + "forfatter: " + forfatter + "pris: " + pris;
        return ut;
    }
}
