package programowanie_zaawansowane.klasy_wewnetrzne.klasy_anonimowe.zadanie2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> slowa = wczytajNWyrazow(5);

        System.out.println("Lista przed posortowaniem:");
        System.out.println(slowa);

        Collections.sort(slowa, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("Po posortowaniu:");
        System.out.println(slowa);
    }

    private static List<String> wczytajNWyrazow(int i) {
        List<String> slowa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (i > 0){
            System.out.println("Podaj slowo:");
            slowa.add(scanner.next());
            i--;
        }
        return slowa;
    }
}
