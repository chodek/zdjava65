package programowanie_zaawansowane.interfejsy.zadanie_jedzenie;

public class Main {

    public static void main(String[] args) {

        Jedzacy krokodyl = new Krokodyl();
        Jedzacy czlowiek = new Programista();
        Jedzacy[] tablicaZjadaczy = new Jedzacy[]{krokodyl,czlowiek};

        Pokarm schabowy = new Pokarm("Schaboszczak", TypPokarmu.MIESO,800);
        Pokarm jablko = new Pokarm("Jablko", TypPokarmu.OWOCE, 100);

        for (Jedzacy jedzacy : tablicaZjadaczy) {
            jedzacy.jedz(schabowy);
        }


        for (Jedzacy jedzacy : tablicaZjadaczy) {
            jedzacy.jedz(jablko);
        }

    }
}
