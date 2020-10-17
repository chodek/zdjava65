package programowanie_zaawansowane.dziedziczenie;

public class Kabriolet extends Samochod{

    private boolean czyDachSchowany;

    public void schowajDach(){
        this.predkosc = 200;
        this.czyDachSchowany = true;
    }

    public boolean czyDachSchowany(){
        return czyDachSchowany;
    }

    @Override
    protected void metoda(){
        System.out.println("Hej, jestem w klasie kabriolet");
    }
}
