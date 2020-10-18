package programowanie_zaawansowane.farby;

import programowanie_zaawansowane.farby.figury.Figura;
import programowanie_zaawansowane.farby.figury.Kolo;
import programowanie_zaawansowane.farby.figury.Kwadrat;

public class Main {

    public static void main(String[] args) {
        Figura figura1 = new Kwadrat(5);
        Figura figura2 = new Kwadrat(10);
        Figura figura3 = new Kwadrat(1);
        // na ten moment 126

        Figura figura4 = new Kolo(3); // 27+
        Figura figura5 = new Kolo(5); //75+

        Figura[] figury = new Figura[]{figura1,figura2,figura3,figura4,figura5};

        System.out.println(SymulatorFarby.obliczZapotrzebowanieNaFarbe(figury, 10));


    }
}
