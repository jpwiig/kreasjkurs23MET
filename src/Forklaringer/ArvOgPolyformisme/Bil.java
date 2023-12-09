package Forklaringer.ArvOgPolyformisme;

public class Bil extends Motorvogn{
    //extends brukes for å hente attributene fra Motorvogn
    private int antallHjul;

    public Bil(String farge, int år, int antallHjul) {
        super(farge, år); //super sier at de samme attributene skal være i konstruktur
        this.antallHjul = antallHjul;
    }
    @Override
    public String toString(){
        return "Bilens farge er: (dette er fra arvet klasse) " + getFarge() + "året den er lagd er: (arv)  " + getÅr() +
                " Antall hjul på bilen er: " + antallHjul ;
    }
}
