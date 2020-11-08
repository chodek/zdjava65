package main.java.strategy.kaczki;

import main.java.strategy.kwakanie.NieKwacz;
import main.java.strategy.latanie.NieLatam;

public class KaczkaWabik extends Kaczka{

    public KaczkaWabik() {
        this.kwakanieInterfejs = new NieKwacz();
        this.latanieInterfejs = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("Kaczka wabik");
    }
}
