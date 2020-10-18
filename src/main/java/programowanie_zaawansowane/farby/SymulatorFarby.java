package programowanie_zaawansowane.farby;

import programowanie_zaawansowane.farby.figury.Figura;

public class SymulatorFarby {

    public static int obliczZapotrzebowanieNaFarbe(Figura[] tablicaFigur, double pojemnoscPojemnika) {
        double sumaPowierzchni = 0;
        for(Figura figura : tablicaFigur){
            sumaPowierzchni += figura.obliczPole();
        }
        return (int) Math.ceil(sumaPowierzchni/pojemnoscPojemnika);
    }
}
