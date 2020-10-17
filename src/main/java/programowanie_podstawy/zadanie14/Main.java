package programowanie_podstawy.zadanie14;

import programowanie_podstawy.utils.Helper;

public class Main {
    public static void main(String[] args) {
        char literaPierwsza = Helper.wczytajMalaLitere();
        char literaDruga = Helper.wczytajMalaLitere();
        System.out.println("Ilosc liter pomiedzy dwoma podanymi literami to: " +
                (Math.abs(literaDruga - literaPierwsza) - 1));
    }
}
