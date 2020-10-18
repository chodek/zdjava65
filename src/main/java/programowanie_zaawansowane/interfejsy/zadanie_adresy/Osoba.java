package programowanie_zaawansowane.interfejsy.zadanie_adresy;

public class Osoba implements posiadaAdres, posiadaImie{

    String imie;
    String nazwisko;
    Adres adres;

    public Osoba(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    @Override
    public Adres getAdres() {
        return this.adres;
    }

    @Override
    public String getImie() {
        return this.imie;
    }
}
