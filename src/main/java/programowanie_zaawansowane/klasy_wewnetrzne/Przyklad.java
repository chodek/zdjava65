package programowanie_zaawansowane.klasy_wewnetrzne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Przyklad {
    public static void main(String[] args) {

        Map<String, Integer> dniWMiesiacu = new HashMap<>();
        dniWMiesiacu.put("styczen", 31);
        dniWMiesiacu.put("luty", 28);
        dniWMiesiacu.put("marzec", 31);

        for (Map.Entry<String, Integer> entry : dniWMiesiacu.entrySet()) {
            System.out.println(entry.getKey() + " ma " + entry.getValue() + " dni.");
        }

        String [] tablica = new String[]{"cos", "ala"};

        Arrays.sort(tablica, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });


    }
}
