package Eksamener.Eksamen22;

public class Papirbok extends Bok{
    private int ISBN;
    public Papirbok(String tittel, String forfatter, double pris, int ISBN){
       super(tittel,forfatter, pris);
       this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + "ISBN " + ISBN;
    }
}
