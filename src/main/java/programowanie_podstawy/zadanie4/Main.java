package programowanie_podstawy.zadanie4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int liczbaOdUzytkownika = pobierzIZwrocIntaOdUzytkownika();
        liczOdJedenDoX(liczbaOdUzytkownika);
    }

    private static int pobierzIZwrocIntaOdUzytkownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnia liczbe calkowita:");
        return scanner.nextInt();
    }

    private static void liczOdJedenDoX(int x) {
        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 7 == 0){
                System.out.println("Pif paf");
            } else if (i % 3 == 0){
                System.out.println("Pif");
            } else if (i % 7 == 0){
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }
    }
}
