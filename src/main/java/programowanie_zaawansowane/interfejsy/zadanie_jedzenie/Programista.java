package programowanie_zaawansowane.interfejsy.zadanie_jedzenie;

public class Programista extends AbstractZjadacz implements Jedzacy {

    public Programista() {
        super();
    }

    @Override
    public void jedz(Pokarm pokarm) {
        System.out.println("Zjadlem");
        this.iloscZjedzonychGramow += pokarm.getWaga();
        this.iloscZjedzonychPosilkow += 1;
    }

    @Override
    public int ilePosilkowZjedzone() {
        return this.iloscZjedzonychPosilkow;
    }

    @Override
    public int ileGramowZjedzone() {
        return this.iloscZjedzonychGramow;
    }
}
