package programowanie_zaawansowane.enumy;

public enum Bilet {
    ULGOWY(1.6d, "Ulgowy"),
    NORMALNY(3.2d, "Normalny"),
    RODZINNY(3.0d, "Rodzinny");

    private double cena;
    private String nazwa;

    public double getCena() {
        return cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    Bilet(double cena, String nazwa) {
        this.cena = cena;
        this.nazwa = nazwa;
    }
}
