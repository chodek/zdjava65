package programowanie_zaawansowane.dziedziczenie;

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
        Samochod that = (Samochod) o;
        if (this.kolor.equals(that.kolor) && this.marka.equals(that.marka) && this.rocznik == that.rocznik) {
            return true;
        } else {
            return false;
        }

    }
}
