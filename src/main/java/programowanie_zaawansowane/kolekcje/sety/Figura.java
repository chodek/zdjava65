package programowanie_zaawansowane.kolekcje.sety;

public abstract class Figura implements Comparable<Figura> {

    public abstract double obliczPole();

    @Override
    public int compareTo(Figura o) {
        return (int) (this.obliczPole() - o.obliczPole());
    }

    @Override
    public String toString() {
        return String.format("Figura{pole: %f}", obliczPole());
    }
}
