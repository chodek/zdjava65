package programowanie_zaawansowane.kolekcje.listy;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {
        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("Bob");
        listaStringow.add("cos");
        listaStringow.add("Ala");
        listaStringow.add("Ala");
        listaStringow.add("Ala");
        listaStringow.add("ma");
        listaStringow.add("kota");
        listaStringow.add("Ala");
        listaStringow.add("ma");

        wyswietlDuplikaty(listaStringow);
        System.out.println(listaStringow);
        listaStringow = usunDuplikaty(listaStringow);
        System.out.println(listaStringow);

    }

    public static void wyswietlDuplikaty(List<String> list) {
        List<String> indexyDuplikatow = new ArrayList<>(); // tworzymy pusta na razie liste Stringow, ktora przechowywac bedzie indexy pod jakimi wystepuja slowa, posiadajace duplikaty
        for (String s : list) { // iteruje po naszej liscie Stringow
            if (list.indexOf(s) != list.lastIndexOf(s)) { // jezeli jakies slowo ma swoje pierwsze wystapienie w innym miejscu niz swoje ostatnie wystapienie (np. slowo "Ala" wystepuje na pozycji 2 i 7), to oznacza to, ze istnieje conajmniej jeden duplikat tego slowa
                indexyDuplikatow.add(list.indexOf(s) + ""); // dodajmy wiec pierwszą pozycje pod jaka znajdziemy ów słowo do listy przechowującej indexy, pod którymi znaleźliśmy słowa które mają duplikaty (indexyDuplikatów)
            }
        }
        indexyDuplikatow = usunDuplikaty(indexyDuplikatow); // z indexyDuplikatów musimy usunąć powtórzenia. Dlaczego? Poniewaz np. najpierw spotkalismy slowo "Ala" na pozycji 2, potem na pozycji 3,4 i 7. Za każdym razem jak spoktamy słowo "Ala", to index pierwszego wystąpienia tego słowa (czyli list.indexOf("Ala") - w naszym wypadku bedzie to 2) zostanie dodane do naszej listy indexyDuplikatow. Nie chcemy jednak wyswietlic uzytkownikowi slowa "Ala" 4 razy (a tyle będzie dwójek w naszej liście), a tylko raz, bo pytanie jest o to, jakie słowa to duplikaty, a nie ile razy są ów słowa zduplikowane.
        for (String index : indexyDuplikatow) { // majac liste indexyDuplikatow bez duplikatów w środku, iterujemy po niej
            System.out.println(list.get(Integer.parseInt(index))); // i wypisujemy na ekran slowo z 'listy' pod indexem pobranym z listy 'indexyDuplikatow' (po drodze parsujac Stringa na inta, bo w Liscie mamy Stringi, a metoda get() przyjmuje tylko inty)
        }
    }

    public static List<String> usunDuplikaty(List<String> listaZDuplikatami) {
        for (int i = 0; i < listaZDuplikatami.size(); i++) { // iteruje po calej liscie z duplikatami
            while (listaZDuplikatami.indexOf(listaZDuplikatami.get(i)) != listaZDuplikatami.lastIndexOf(listaZDuplikatami.get(i))) {
                /*
                listaZDuplikatami.get(i) - pobranie kolejnego slowa z listy ('i' to licznik zewnetrznej petli)
                listaZDuplikatami.indexOf(listaZDuplikatami.get(i)) - sprawdzenie jaki jest index pierwszego wystąpienia pobranego slowa z listy w tej samej liscie
                listaZDuplikatami.lastIndexOf(listaZDuplikatami.get(i)) - sprawdzenie jaki jest index ostatniego wystapienia pobranego slowa z listy w tej samej liscie
                jezeli te 2 linijki powyzej zwrócą rózne liczby ( != ), to oznacza to, ze slowo na ktorym obecnie pracujemy (i-te slowo z listy) posiada gdzies w tej liscie duplikat
                */
                listaZDuplikatami.remove(listaZDuplikatami.lastIndexOf(listaZDuplikatami.get(i)));
                /*
                Wiec trzeba te duplikaty usunac metoda listaZDuplikatami.remove(n), gdzie n musi byc indexem elementu ktory chcemy usunac
                Chcemy usunac powtorzenie i-tego slowa ktore znalezlismy najdalej (o najdalszym indexie - metoda lastIndexOf())
                listaZDuplikatami.get(i) - pobierz i-te slowo z listy
                listaZDuplikatami.lastIndexOf(listaZDuplikatami.get(i) - znajdz index ostatniego wystapienia i-tego slowa z listy w tej liscie
                listaZDuplikatami.remove(listaZDuplikatami.lastIndexOf(listaZDuplikatami.get(i))) - usun z listy element o indeksie ostatniego wystapienia i-tego slowa z listy w tej liscie
               */
            } // To wszystko trzeba powtarzać tak długo, aż występują duplikaty, czyli az indexOf() nie bedzie równy lastIndexOf() dla danego slowa - stad tez petla while
        }
        return listaZDuplikatami; // zwroc liste ktora wbrew swojej nazwie, na tym etapie juz nie bedzie posiadac duplikatow
    }
}
