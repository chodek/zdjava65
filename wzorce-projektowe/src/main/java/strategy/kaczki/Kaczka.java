package main.java.strategy.kaczki;

import main.java.strategy.kwakanie.KwakanieInterfejs;
import main.java.strategy.latanie.LatanieInterfejs;

public abstract class Kaczka {

    LatanieInterfejs latanieInterfejs;
    KwakanieInterfejs kwakanieInterfejs;

    public void setLatanieInterfejs(LatanieInterfejs latanieInterfejs) {
        this.latanieInterfejs = latanieInterfejs;
    }

    public void setKwakanieInterfejs(KwakanieInterfejs kwakanieInterfejs) {
        this.kwakanieInterfejs = kwakanieInterfejs;
    }

    public abstract void wyswietl();

    public void wykonajKwacz(){
        kwakanieInterfejs.kwacz();
    }

    public void plywaj(){
        System.out.println("Plywam!");
    }

    public void wykonajLec(){
        latanieInterfejs.lec();
    }
}
