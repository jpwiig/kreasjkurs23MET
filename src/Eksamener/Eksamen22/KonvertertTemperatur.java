package Eksamener.Eksamen22;

public class KonvertertTemperatur {
    private double c = 0;
    private double f = 0;

    public KonvertertTemperatur(double c, double f) {
        this.c = c;
        this.f = f;
    }

    public static double tilCelcius(double farenheit) {
        double celcius = 0;
        //Formelen for celcius er: (F-32) / 1.8
        celcius = (farenheit - 32) / 1.8;
        return celcius;
    }

    public static double tilFarenheit(double celcius) {
        double f = 0;
        f = (celcius * 1.8) + 32;
        return f;
    }

    public String returnerCelciusOgFarenHeit(){
        return "Celcius var " + c +  "og i farenheit blir det: " + tilFarenheit(c) + " Farenheit er " + f + "og i celcius blir det: " + tilCelcius(f);
     }
}

