package programowanie_zaawansowane.typy_generyczne.zadanie2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        MojaLista<String> lista = new MojaLista<>(10);

        lista.dodaj("Ala");
        lista.dodaj("ma");
        lista.dodaj("kota");

        System.out.println(lista.zawiera("Ala"));
        System.out.println(lista.zawiera("ala"));

        System.out.println(lista.toString());


    }


}
