package programowanie_zaawansowane.kolekcje.sety;

public class Kwadrat extends Figura {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public double obliczPole() {
        return bok * bok;
    }
}
