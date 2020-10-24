package programowanie_zaawansowane.dziedziczenie;

import java.util.Objects;

public class Samochod {

    protected String kolor;
    protected String marka;
    protected int rocznik;

    public Samochod(String kolor, String marka, int rocznik) {
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    @Override
    public String toString() {
        return kolor + " samochod marki: " + marka + " rocznik: " + rocznik;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samochod samochod = (Samochod) o;
        return rocznik == samochod.rocznik &&
                Objects.equals(marka, samochod.marka); // to jest tozsamy zapis z:
               // marka.equals(samochod.marka);
    }

    @Override
    public int hashCode() {
        return 17 * marka.hashCode() + 31 * rocznik + 7 * kolor.hashCode();
    }
}
