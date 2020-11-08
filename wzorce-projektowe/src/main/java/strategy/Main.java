package main.java.strategy;

import main.java.strategy.kaczki.DzikaKaczka;
import main.java.strategy.kaczki.Kaczka;
import main.java.strategy.kwakanie.Piszcz;
import main.java.strategy.latanie.LotZNapedemRakietowym;

public class Main {

    public static void main(String[] args) {
        Kaczka dzikaKaczka = new DzikaKaczka();

        dzikaKaczka.plywaj();
        dzikaKaczka.wykonajKwacz();
        dzikaKaczka.wykonajLec();
        dzikaKaczka.wyswietl();

        System.out.println("- - - - - - - - -- - - - - - - - -- - ");
        dzikaKaczka.setKwakanieInterfejs(new Piszcz());
        dzikaKaczka.setLatanieInterfejs(new LotZNapedemRakietowym());

        dzikaKaczka.wykonajKwacz();
        dzikaKaczka.wykonajLec();
    }
}
