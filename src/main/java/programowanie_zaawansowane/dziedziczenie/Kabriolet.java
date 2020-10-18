package programowanie_zaawansowane.dziedziczenie;

public class Kabriolet extends Samochod {

    private boolean czyDachSchowany;

    public Kabriolet(String marka, String kolor, int rocznik, boolean czyDachSchowany) {
        super(kolor, marka, rocznik);
        this.czyDachSchowany = czyDachSchowany;
    }


    public void schowajDach() {
        if (czyDachSchowany) {
            System.out.println("Dach jest juz schowany");
        } else {
            this.czyDachSchowany = true;
        }
    }

    public boolean czyDachSchowany() {
        return czyDachSchowany;
    }


    @Override
    public String toString() {
        return super.toString() + " z rozsuwanym dachem";
    }
}
