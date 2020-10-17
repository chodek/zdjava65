package programowanie_podstawy.zadanie5;

import programowanie_podstawy.utils.Helper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe do ktorej chcesz szukac liczb pierwszych: ");
        int pobranaLiczba = Helper.wczytajIntaDodatniego();
        wypiszLiczbyPierwszeOdJedenDoX(pobranaLiczba);
    }

    private static void wypiszLiczbyPierwszeOdJedenDoX(int x) {
        for (int i = 2; i <= x; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
