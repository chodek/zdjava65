package programowanie_zaawansowane.klasy_wewnetrzne;

import java.util.Arrays;

public class MainKlasaLokalnaWewnetrzna {
    public static void main(String[] args) {
        localClassInstantiation(args);
    }



    private static void localClassInstantiation(String[] args) {
        class LocalClass {
            @Override
            public String toString() {
                return "Argumenty metod: " + Arrays.toString(args);
            }
        }

        LocalClass localClassInstance = new LocalClass();
        System.out.println(localClassInstance);
    }

    public void cokolwiek(){
        // LocalClass localClass = new LocalClass(); // nie mamy dostepu do lokalnej klasy wewnetrznej z metody powyzej
    }
}
