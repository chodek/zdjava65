package programowanie_zaawansowane.interfejsy.zadanie_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student jeden = new Student("Marcin", "Chodkowski", 130);
        Student dwa = new Student("Jan", "Kowalski", 120);
        Student trzy = new Student("Tomasz", "Alzer", 100);

        Student[] tablicaStudenciakow = new Student[]{jeden, dwa, trzy};

        Czlowiek[] tablicaCzlowiekow = new Czlowiek[]{new Czlowiek(10), new Czlowiek(50)};

        Arrays.sort(tablicaCzlowiekow); //sortowanie obiektow klasy Czlowiek nie zadziala, poniewaz klasa Czlowiek, nie implementuje interfejsu Comparable


        //Wypisanie tablicy przed posortowaniem
        for (Student student : tablicaStudenciakow) {
            System.out.println(student);
        }

        //posotujmy nasza tablice
        Arrays.sort(tablicaStudenciakow);
        System.out.println("Sorotwanie w toku");


        //Wypisanie tablicy po posortowaniu
        for (Student student : tablicaStudenciakow) {
            System.out.println(student);
        }

    }
}
