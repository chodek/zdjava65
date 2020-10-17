package programowanie_podstawy.zadanie9;

import programowanie_podstawy.utils.Helper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int wczytanaLiczba = Helper.wczytajIntaDodatniego();
        wyrysujFaleODlugosciN(wczytanaLiczba);

    }

    private static void wyrysujFaleODlugosciN(int n) {
        Scanner scanner = new Scanner(System.in);
        int resztaZDzielenia = n % 15;
        String pierwszaLinia = "", drugaLinia = "", trzeciaLinia = "", czwartaLinia = "";
        for (int i = 0; i < n / 15; i++) {
            pierwszaLinia += "*      *" + "*     *";
            drugaLinia    += " *    * " + " *   * ";
            trzeciaLinia  += "  *  *  " + "  * *  ";
            czwartaLinia  += "   **   " + "   *   ";
        }
        if (resztaZDzielenia != 0) {
            pierwszaLinia += ("*      *" + "*     *").substring(0, resztaZDzielenia);
            drugaLinia    += (" *    * " + " *   * ").substring(0, resztaZDzielenia);
            trzeciaLinia  += ("  *  *  " + "  * *  ").substring(0, resztaZDzielenia);
            czwartaLinia  += ("   **   " + "   *   ").substring(0, resztaZDzielenia);
        }

        System.out.println(pierwszaLinia);
        System.out.println(drugaLinia);
        System.out.println(trzeciaLinia);
        System.out.println(czwartaLinia);

    }


}
