package programowanie_zaawansowane.klasy_wewnetrzne;

public class MainStatyczny {
    public static void main(String[] args) {
        KlasaZewnetrzna2 klasaZewnetrzna = new KlasaZewnetrzna2();

        KlasaZewnetrzna2.KlasaWewnetrzna2 instancja1 = klasaZewnetrzna.instantiate();
        KlasaZewnetrzna2.KlasaWewnetrzna2 instancja2 = new KlasaZewnetrzna2.KlasaWewnetrzna2();
    }
}
