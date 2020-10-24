package programowanie_zaawansowane.kolekcje.sety;

import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Figura prostokat1 = new Prostokat(10,5);
        Figura prostokat2 = new Prostokat(1,2);

        Figura kwadrat1 = new Kwadrat(5);
        Figura kwadrat2 = new Kwadrat(2);

        Set<Figura> setFigur = new LinkedHashSet<>();
        setFigur.add(prostokat1);
        setFigur.add(prostokat2);
        setFigur.add(kwadrat1);
        setFigur.add(kwadrat2);

        System.out.println(setFigur.toString());



    }
}
