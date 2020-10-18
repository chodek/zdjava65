package programowanie_zaawansowane.farby.figury;

public class Kolo extends Figura {
    double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return Math.PI * r * r;
    }
}
