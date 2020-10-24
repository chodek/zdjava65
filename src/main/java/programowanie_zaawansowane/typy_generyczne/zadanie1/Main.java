package programowanie_zaawansowane.typy_generyczne.zadanie1;

public class Main {

    public static void main(String[] args) {

        Samochod bmw = new BMW("X5","czarny");
        Samochod porshe = new Porshe("Cayenne", "Srebrny");

        Garaz<Samochod> mojDomowyGaraz = new Garaz<>();
        Garaz<BMW> mojDomowyGaraz2 = new Garaz<>();

        mojDomowyGaraz.zaparkujAuto(bmw);
        mojDomowyGaraz.zaparkujAuto(porshe);

        System.out.println(mojDomowyGaraz.wyprowadz(porshe));
        System.out.println(mojDomowyGaraz.wyprowadz(new BMW("X4","rozowy")));
    }
}
