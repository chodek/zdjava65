package programowanie_zaawansowane.kolekcje.mapy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Zadanie1 {

    public static void main(String[] args) {
        Map<String, Integer> mapaImieWiek = new TreeMap<>();
        mapaImieWiek.put("Marcin", 80); // dodanie pary klucz-wartosc do mapy, kluczem jest String "Marcin", a wartoscia int=80
        mapaImieWiek.put("Tomasz", 50);
        mapaImieWiek.put("Ala", 20);
        mapaImieWiek.put("Kasia", 30);

        System.out.println(mapaImieWiek);
        mapaImieWiek.put("Tomasz", 150);
        System.out.println(mapaImieWiek);

        for (String klucz : mapaImieWiek.keySet()) { // iterując po keySecie mamy pewnosc, ze wezmiemy pod uwage kazdy klucz obecny w mapie, więc i również każdą wartość
            System.out.println(klucz);
        }



    }
}
