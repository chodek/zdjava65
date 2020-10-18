package programowanie_zaawansowane.interfejsy.zadanie_adresy;

public class Adres {
    private String ulica;
    private int numerDomu;
    private String miasto;

    public Adres(String ulica, int numerDomu, String miasto) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }
}
