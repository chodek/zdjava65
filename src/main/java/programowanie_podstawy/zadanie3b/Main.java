package programowanie_podstawy.zadanie3b;

import programowanie_podstawy.utils.Helper;

public class Main {
    public static void main(String[] args) {
        obliczPierwiastkiRownania();
    }

    public static void obliczPierwiastkiRownania() {
        int tablica[] = pobierzDaneOdUzytkownika();
        RownanieKwadratowe rownanieKwadratowe = new RownanieKwadratowe(tablica[0], tablica[1], tablica[2]);
        rownanieKwadratowe.wypiszPierwiastki();
    }

    private static int[] pobierzDaneOdUzytkownika() {
        System.out.println("Podaj a: ");
        int a = Helper.wczytajInta();
        System.out.println("Podaj b: ");
        int b = Helper.wczytajInta();
        System.out.println("Podaj c: ");
        int c = Helper.wczytajInta();

        return new int[]{a, b, c};
    }
}
