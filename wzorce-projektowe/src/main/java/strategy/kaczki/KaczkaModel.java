package main.java.strategy.kaczki;

import main.java.strategy.kwakanie.NieKwacz;
import main.java.strategy.latanie.LatamBoMamSkrzydla;

public class KaczkaModel extends Kaczka {

    public KaczkaModel() {
        this.kwakanieInterfejs = new NieKwacz();
        this.latanieInterfejs = new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Kaczka Model");
    }
}
