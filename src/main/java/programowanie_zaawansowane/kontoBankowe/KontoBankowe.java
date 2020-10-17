package programowanie_zaawansowane.kontoBankowe;

public class KontoBankowe {

    public long numerKonta;
    public int stanKonta;


    public KontoBankowe(long numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }

    void wyswietlStanKonta(){
        System.out.println(this.stanKonta);
    }

    void wplacSrodki(int kwotaDoWplacenia){
        this.stanKonta += kwotaDoWplacenia;
    }

    int pobierzSrodki(int kwotaDoWyplaty){
        this.stanKonta -= kwotaDoWyplaty;
        return kwotaDoWyplaty;
    }

   
}
