package programowanie_podstawy.zadanie2;

import programowanie_podstawy.utils.Helper;

public class Zadanie2Main {
    public static void main(String[] args) {
        obliczBMI();
    }

    private static void obliczBMI() {
        System.out.println("Podaj wagę");
        float waga = Helper.wczytajFloataDodatniego();
        System.out.println("Podaj wzrost w cm: ");
        int wzrostCM = Helper.wczytajIntaDodatniego();
        double bmi = waga / Math.pow((float) (wzrostCM / 100), 2);
        zweryfikujBMI(bmi);
    }

    private static void zweryfikujBMI(double bmi) {
        if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("BMI optymalne");
        } else {
            System.out.println("BMI nieoptymalne");
        }
    }
}
