package programowanie_zaawansowane.interfejsy.zadanie_adresy;

public class Main {

    public static void main(String[] args) {

        Osoba osoba1 = new Osoba("Marcin", "Chodkowski", new Adres("Zwirki i Wigury", 15, "Gdansk"));
        Osoba osoba2 = new Osoba("Tomasz", "Kowalski", new Adres("Wajdeloty", 1, "Gdynia"));

        Firma firma1 = new Firma("SDA", new Adres("Zwirki i Wigury", 15, "Gdansk"));
        Firma firma2 = new Firma("Infoshare", new Adres("Wajdeloty", 1, "Gdynia"));

        System.out.println(czyAdresJestGdanski(osoba1));
        System.out.println(czyAdresJestGdanski(osoba2));
        System.out.println(czyAdresJestGdanski(firma1));
        System.out.println(czyAdresJestGdanski(firma2));
    }

    public static boolean czyAdresJestGdanski(posiadaAdres adres) {
        return adres.getAdres().getMiasto().contains("Gdansk");
    }

}

