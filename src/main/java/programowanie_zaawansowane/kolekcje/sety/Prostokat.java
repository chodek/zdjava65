package programowanie_zaawansowane.kolekcje.sety;

public class Prostokat extends Figura {
    private double bokA, bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double obliczPole() {
        return bokA*bokB;
    }
}
