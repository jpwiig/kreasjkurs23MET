package Eksamener.eksamen21;

import java.util.ArrayList;
import java.util.List;

//oppgave 2 eksamen22konte
public class oppgave2Konte {



}
class Valuta {
    private String valuta;
    private double kurs;

    public Valuta(String valuta, double kurs) {
        this.valuta = valuta;
        this.kurs = kurs;
    }

    public String getValuta() {
        return valuta;
    }

    public double getKurs() {
        return kurs;
    }
}


class ValutaKalkulator {
    private List<Valuta> valutaKurser = new ArrayList<>();

    public ValutaKalkulator() {
        //kode
        //legger vi inn valutaen i konstruktøren
        valutaKurser.add(new Valuta("USD", 11.5));
        valutaKurser.add(new Valuta("DDK", 0.75));
    }

    public double begregnkurs(String valuta) {
        for (int i = 0; i < valutaKurser.size(); i++) {
            if (valuta == valutaKurser.get(i).getValuta()) return valutaKurser.get(i).getKurs();
        }
        return 0;
    }
}