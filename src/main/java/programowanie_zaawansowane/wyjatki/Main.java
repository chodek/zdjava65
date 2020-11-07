package programowanie_zaawansowane.wyjatki;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //System.out.println(getNumerOfSeconds(5));
        //System.out.println(getNumerOfSeconds(-1));
        metoda1();
    }

    public static int getNumerOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0 , was" + hour);
        }
        return hour * 60 * 60;
    }

    public static void metoda1() {
        metoda2();
    }

    public static void metoda2() {
        //metodaRzucajacaUncheckedException(); // mozemy uzyc tej metody, bo rzuca niejawny wyjatek

        try {
            metodaRzucajacaCheckedException(true); // ta metoda rzuca jawny wyjatek
        } catch (IOException  e) {
            e.printStackTrace();
            return;
        } finally {
            System.out.println("Jestem w bloku finally");
        }

        System.out.println("Przeslismy za sekcje try/catch");
    }

    public static void metodaRzucajacaUncheckedException() {
        throw new IllegalArgumentException("Wyjatek dziedziczacy po runtimeException");
    }

    public static void metodaRzucajacaCheckedException(boolean czyRzucicWyjatek) throws IOException {
        if (czyRzucicWyjatek) {
            throw new IOException("Wyjatek dziedziczacy po Exception");
        }
        System.out.println("Jestesmy w metodzie rzucajacej checked exception");
    }

    public static void metodaRzucajacaUnchheckedException2(boolean czyRzucicWyjatek) throws ArithmeticException {
        if (czyRzucicWyjatek) {
            throw new ArithmeticException("Wyjatek dziedziczacy po RuntimeException");
        }
        System.out.println("Jestesmy w metodzie rzucajacej unchecked exception");
    }

}
