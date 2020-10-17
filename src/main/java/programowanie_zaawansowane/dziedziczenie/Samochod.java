package programowanie_zaawansowane.dziedziczenie;

public class Samochod {

    protected double predkosc;
    protected boolean swiatla;

    protected void metoda(){
        System.out.println("Hej, jestem w klasie Samochod");
    }

    public void przyspiesz() {
        if (this.predkosc <= 110) {
            this.predkosc += 10;
            System.out.println("Przyspieszam do " + this.predkosc + " km/h");
        } else {
            System.out.println("Samochod nie moze jechac szybciej");
        }
    }

    public void przelaczSwiatla() {
        this.swiatla = !this.swiatla;
    }

    public boolean czySwiatlaWlaczone() {
        return this.swiatla;
    }
}
