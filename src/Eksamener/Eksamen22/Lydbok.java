package Eksamener.Eksamen22;

public class Lydbok extends Bok{
    private int lengdeMinutter;
    public Lydbok(String tittel, String forfatter, double pris, int lengdeMinutter ){
        super(tittel, forfatter, pris); //henter fra et arvet klasse
        this.lengdeMinutter = lengdeMinutter;
    }
    public String toString(){
        return super.toString() + "Lenge på boken: " + lengdeMinutter;
    }
}
