package programowanie_zaawansowane.typy_generyczne.zadanie1;

public class Samochod {
    String marka;
    String model;
    String kolor;

    protected Samochod(String marka, String model, String kolor) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }

    public void zmienKolor(String nowyKolor){
        this.kolor = nowyKolor;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
