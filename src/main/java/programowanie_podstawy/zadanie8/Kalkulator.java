package programowanie_podstawy.zadanie8;

import programowanie_podstawy.utils.Helper;

public class Kalkulator {
    private float liczbaL, liczbaP;
    private char znak;

    public void wczytajDane() {
        this.liczbaL = Helper.wczytajFloata();
        System.out.println("Podaj symbol działania");
        znak = Helper.wczytajChara();
        if (!sprawdzZnak(znak)) {
            System.out.println("Bledny znak");
            return;
        }
        this.liczbaP = Helper.wczytajFloata();
    }

    private boolean sprawdzZnak(char znak) {
        if (znak == '*' || znak == '/' || znak == '+' || znak == '-') {
            return true;
        } else {
            return false;
        }
    }

    public float obliczWynik() {
        switch (znak) {
            case '-':
                return liczbaL - liczbaP;
            case '+':
                return liczbaL + liczbaP;
            case '*':
                return liczbaL * liczbaP;
            case '/':
                if (liczbaP == 0) {
                    System.out.println("Blad");
                    break;
                }
                return liczbaL / liczbaP;
            }
        return 0; // TODO jak to lepiej rozwiazac?
    }
}
