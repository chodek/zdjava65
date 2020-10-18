package programowanie_zaawansowane.farby.figury;

public class Kwadrat extends Figura {
    double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }

    @Override
    public double obliczPole() {
        return bok * bok;
    }
}
