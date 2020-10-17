package programowanie_podstawy.zadanie3a;

import programowanie_podstawy.utils.Helper;

public class Main {

    public static void main(String[] args) {
        obliczPierwiastkiRownania();
    }

    private static void obliczPierwiastkiRownania() {
        int a = Helper.wczytajInta();
        int b = Helper.wczytajInta();
        int c = Helper.wczytajInta();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if(delta > 0) {
            double x1 = (((-1) * b - Math.sqrt(delta)) / (2 * a));
            double x2 = (((-1) * b + Math.sqrt(delta)) / (2 * a));
            System.out.println("Z twojego rownania wynika, ze x1 to: " + x1 + ", a x2 to: " + x2);
        } else {
            System.out.println("Delta wyszla ujemna, sory");
        }
    }
}
