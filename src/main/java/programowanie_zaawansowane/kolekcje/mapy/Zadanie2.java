package programowanie_zaawansowane.kolekcje.mapy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zadanie2 {

    public static void main(String[] args) {
        String tekst = "Ala ma kota ala ma ma";
        wypiszMape(zliczWystapienia(tekst));
        wypiszMapePosortowanaPoWartosci(zliczWystapienia((tekst)));

    }

    public static Map<String, Integer> zliczWystapienia(String doZliczenia) {
        String[] tablicaSlow = doZliczenia.split(" "); // podzielenie tekstu na wyrazy
        Map<String, Integer> mapaWystapien = new HashMap<>(); //stworzenie mapy wystapien slow
        for (String slowo : tablicaSlow) { // dla kazdego slowa w tablicySlow
            if (mapaWystapien.get(slowo) != null) { // jesli to slowo wystepuje w mapie
                mapaWystapien.put(slowo.toLowerCase(), mapaWystapien.get(slowo) + 1);  // to zwieksz wartosc jaka przechowuje ten klcuz (slowo) o 1 -> przez pobranie wartosci jaka obecnie przechwouje ten klucz i powiekszenie jej o jeden, a nastepnie zapisanie ten powiekszonej wartosci pod tym samym kluczem
            } else { // jezeli danego slowa nie ma w mapie
                mapaWystapien.put(slowo.toLowerCase(), 1); // to dodaj slowo do mapy z wystapieniami = 1
            }
        }
        return mapaWystapien; // zwrocenie mapy z metody
    }

    public static void wypiszMape(Map<String, Integer> mapaWystapien) {
        for (String slowo : mapaWystapien.keySet()) {
            System.out.println("Slowo " + slowo + " ma " + mapaWystapien.get(slowo) + " wystapien.");
        }
    }

    public static void wypiszMapePosortowanaPoWartosci(Map<String, Integer> mapaWystapien) {
        List<Map.Entry<String, Integer>> listWpisowMapy = new ArrayList<>(mapaWystapien.entrySet()); // tworze liste ktora przechowywac bedzie obiekty typu Map.Entry, czyli kolejne pary klucz-wartosc z mapy i od razy inicjalizuje te liste wywolujac w konstruktorze ArrayListy metode entrySet() na naszej mapie, co zwroci wszystkie pary klucz-wartosc z mapy i od razu zainicjuje nimi liste
        listWpisowMapy.sort(Map.Entry.comparingByValue()); // Uzylem Comparatora z klasy Map.Entry aby za jego pomoca posortowac liste zawierajaca wszystkie wpisy z map
        System.out.println(listWpisowMapy);
    }
}
