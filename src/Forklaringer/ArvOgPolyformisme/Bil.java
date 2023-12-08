package Forklaringer.ArvOgPolyformisme;

public class Bil extends Motorvogn{
    private int antallHjul;

    public Bil(String farge, int år, int antallHjul) {
        super(farge, år);
        this.antallHjul = antallHjul;
    }
    @Override
    public String toString(){
        return "Bilens farge er: (dette er fra arvet klasse) " + getFarge() + "året den er lagd er: (arv)  " + getÅr() +
                " Antall hjul på bilen er: " + antallHjul ;
    }
}
