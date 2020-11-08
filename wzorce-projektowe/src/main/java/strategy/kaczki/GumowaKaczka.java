package main.java.strategy.kaczki;

import main.java.strategy.kwakanie.Piszcz;
import main.java.strategy.latanie.NieLatam;

public class GumowaKaczka extends Kaczka{

    public GumowaKaczka() {
        this.kwakanieInterfejs = new Piszcz();
        this.latanieInterfejs = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("Gumowa kaczka");
    }
}
