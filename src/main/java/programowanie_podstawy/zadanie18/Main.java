package programowanie_podstawy.zadanie18;

import programowanie_podstawy.utils.Helper;

public class Main {

    public static void main(String[] args) {
       String wczytanyTekst = Helper.wczytajStringa();
       System.out.println(wczytanyTekst.matches("^a+(\\s)+psik"));
    }
}
