package programowanie_zaawansowane.interfejsy.zadanie_comparable;

public class Student implements Comparable {

    private String imie;
    private String nazwisko;
    private int numerAlbumu;

    @Override
    public int compareTo(Object o) {
        Student that = (Student) o;
        return Integer.compare(this.numerAlbumu, that.numerAlbumu);
        // linijka wyzej jest rownie dobra jak linijka ponizej:
        // return this.numerAlbumu - that.numerAlbumu;
    }

    public Student(String imie, String nazwisko, int numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
    }

    public int getNumerAlbumu() {
        return numerAlbumu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerAlbumu=" + numerAlbumu +
                '}';
    }
}
