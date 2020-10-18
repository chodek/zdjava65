package programowanie_zaawansowane.dziedziczenie;

public class Main {

    public static void main(String[] args) {
        Samochod bmw = new Samochod("Czerwony", "BMW", 1992);
        Samochod opel = new Samochod("Czerwony", "Opel", 1993);

        System.out.println(bmw.toString());
        System.out.println(opel.toString());

        System.out.println(bmw.equals(opel));
    }
}
