package programowanie_podstawy.zadanie6;

import programowanie_podstawy.utils.Helper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj n do obliczenia sumy szeregu harmonicznego: ");
        int pobrana = Helper.wczytajInta();
        System.out.println(obliczSumeSzereguHarmonicznego(pobrana));
    }

    private static double obliczSumeSzereguHarmonicznego(int pobrana) {
        double suma = 0.0;
        for (int i = 1; i <= pobrana; i++) {
            suma += (1.0/i);
        }
        return suma;

        //TODO przerobic kod tak, aby dzialal z liczbami ujemnymi od uzytkownika
    }
}
