package programowanie_zaawansowane.interfejsy.zadanie_adresy;

public class Firma implements posiadaAdres, posiadaNazwe{
    String nazwa;
    Adres adres;

    public Firma(String nazwa, Adres adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }

    @Override
    public Adres getAdres() {
        return this.adres;
    }

    @Override
    public String getNazwa() {
        return this.nazwa;
    }
}
