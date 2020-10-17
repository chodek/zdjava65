package programowanie_podstawy.zadanie3;

public class RachunekBankowy {

    private String numerKonta;
    private double iloscSrodkow;
    private String imie;
    private String nazwisko;


    public RachunekBankowy(String numerKonta, double iloscSrodkow, String imie, String nazwisko) {
        this.numerKonta = numerKonta;
        this.iloscSrodkow = iloscSrodkow;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void wykonajPrzelewWychodzacy(double kwota){
        this.iloscSrodkow -= kwota;
    }

    public void wykonajPrzelewPrzychodzacy (double kwota){
        this.iloscSrodkow += kwota;
    }



    public String getNumerKonta() {
        return numerKonta;
    }

    public double getIloscSrodkow() {
        return iloscSrodkow;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
