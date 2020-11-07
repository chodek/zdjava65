package programowanie_zaawansowane.typy_generyczne.zadanie1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Samochod bmw = new BMW("X5", "czarny");
        Samochod porshe = new Porshe("Cayenne", "Srebrny");

        Garaz<Samochod> mojDomowyGaraz = new Garaz<>();
        Garaz<BMW> mojDomowyGaraz2 = new Garaz<>();

        mojDomowyGaraz.zaparkujAuto(bmw);
        mojDomowyGaraz.zaparkujAuto(porshe);
        try (
                BufferedReader fileReader = new BufferedReader(new FileReader("c:/s/s/s"));
                BufferedReader fileReader2 = fileReader;
                ) {
            System.out.println(mojDomowyGaraz.wyprowadz(porshe));
            System.out.println(mojDomowyGaraz.wyprowadz(new BMW("X4", "rozowy")));
        } catch (CarNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
