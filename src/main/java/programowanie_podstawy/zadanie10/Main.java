package programowanie_podstawy.zadanie10;

import programowanie_podstawy.utils.Helper;

public class Main {
    public static void main(String[] args) {
        int liczba = Helper.wczytajInta();
        System.out.println(zsumujCyfryWLiczbie(liczba));
    }

    private static int zsumujCyfryWLiczbie(int liczba){
        int suma = 0;
        while(liczba > 0) {
            suma += liczba % 10;
            liczba = liczba/10;
        }
        return suma;
    }
}
