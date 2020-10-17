package programowanie_podstawy.zadanie1;

import programowanie_podstawy.utils.Helper;

public class Zadanie1 {

    public static void main(String[] args) {
        liczObwod();
    }

    private static void liczObwod() {
        float srednica = Helper.wczytajFloata();
        float obwod = (float) (srednica * Math.PI);
        System.out.println("Obwod kola to: " + obwod);
    }
}
