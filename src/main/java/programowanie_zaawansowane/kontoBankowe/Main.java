package programowanie_zaawansowane.kontoBankowe;

public class Main {

    public static void main(String[] args) {

        KontoBankowe kontoAndrzeja = new KontoBankowe(123l,1000);
        KontoBankowe kontoBeaty = new KontoBankowe(555l, 2000);


        kontoAndrzeja.wyswietlStanKonta();
        kontoBeaty.wyswietlStanKonta();

        kontoBeaty.wplacSrodki(kontoAndrzeja.pobierzSrodki(100));
    }
}
