package programowanie_podstawy.utils;

import java.util.Scanner;

public class Helper {

    public static float wczytajFloata() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj floata: ");
        return scanner.nextFloat();
    }

    public static float wczytajFloataDodatniego() {
        Scanner scanner = new Scanner(System.in);
        float wczytany;

        do {
            System.out.println("Podaj floata: ");
            wczytany = scanner.nextFloat();
        } while (wczytany < 0);

        return wczytany;
    }

    public static int wczytajInta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj inta: ");
        return scanner.nextInt();
    }

    public static int wczytajIntaDodatniego() {
        Scanner scanner = new Scanner(System.in);
        int wczytany;

        do {
            System.out.println("Podaj inta: ");
            wczytany = scanner.nextInt();
        } while (wczytany <= 0);

        return wczytany;
    }

    public static char wczytajChara() {
        System.out.println("Podaj chara");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }

    public static char wczytajMalaLitere() {
        Scanner scanner = new Scanner(System.in);
        char wczytany;
        do {
            System.out.println("Podaj mala litere");
            wczytany = scanner.nextLine().charAt(0);
        } while (wczytany < 97 || wczytany > 122);
        return wczytany;
    }

    public static String wczytajStringa() {
        System.out.println("Podaj stringa: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
