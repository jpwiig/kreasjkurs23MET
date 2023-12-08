package Eksamener.Eksamen22;

import Forklaringer.ArvOgPolyformisme.ImplementationOfInterFace;

//Oppgave 2
public class Liste {
    //heltallsArray da man returerer antall elementer i lista:
    public static int antallStorreEnnNull(int []a){
        int storreenNull = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > 0) storreenNull++;
        }
        return storreenNull;
    }

    public static int  antallGangerEttTallForekommer(int []a, int n ){
      int teller = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == n) teller++;
        }
        return teller;
    }

    public static int finnStorsteTall(int []a){
        int storst = 0;
        for (int i = 0; i < a.length; i++){
            if ( storst < a[i]) storst = a[i];
        }
        return storst;
    }
}
