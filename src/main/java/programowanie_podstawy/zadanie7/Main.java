package programowanie_podstawy.zadanie7;

import programowanie_podstawy.utils.Helper;

public class Main {
    public static void main(String[] args) {
        int pobrana = Helper.wczytajIntaDodatniego();
        wypiszNtyWyrazCiaguFibb(pobrana);
    }

    private static void wypiszNtyWyrazCiaguFibb(int n) {
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            fib += prevFib;
            prevFib = fib - prevFib;
        }
        System.out.println(fib);
    }
}
