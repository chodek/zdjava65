package programowanie_zaawansowane.interfejsy.zadanie_jedzenie;

public class Pokarm {
    private String nazwa;
    private TypPokarmu typPokarmu;
    private double waga;

    public Pokarm(String nazwa, TypPokarmu typPokarmu, double waga) {
        this.nazwa = nazwa;
        this.typPokarmu = typPokarmu;
        this.waga = waga;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public TypPokarmu getTypPokarmu() {
        return typPokarmu;
    }

    public void setTypPokarmu(TypPokarmu typPokarmu) {
        this.typPokarmu = typPokarmu;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }
}
