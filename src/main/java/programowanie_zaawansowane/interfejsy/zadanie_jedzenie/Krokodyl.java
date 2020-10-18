package programowanie_zaawansowane.interfejsy.zadanie_jedzenie;

public class Krokodyl extends AbstractZjadacz implements Jedzacy {
    @Override
    public void jedz(Pokarm pokarm) {
        if(pokarm.getTypPokarmu() == TypPokarmu.MIESO){
            System.out.println("Mniam mniam");
            this.iloscZjedzonychGramow += pokarm.getWaga();
            this.iloscZjedzonychPosilkow += 1;
        } else {
            System.out.println("Fuj, ja nie jem: " + pokarm.getTypPokarmu());
        }
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
