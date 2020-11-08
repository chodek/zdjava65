package main.java.strategy.kaczki;

import main.java.strategy.kwakanie.Kwacz;
import main.java.strategy.latanie.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {
    @Override
    public void wyswietl() {
        System.out.println("Dzika kaczka");
    }

    public DzikaKaczka() {
        this.kwakanieInterfejs = new Kwacz();
        this.latanieInterfejs = new LatamBoMamSkrzydla();
    }
}
