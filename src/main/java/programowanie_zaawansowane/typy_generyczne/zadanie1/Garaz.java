package programowanie_zaawansowane.typy_generyczne.zadanie1;

public class Garaz<T> {

    private T pierwszy;
    private T drugi;

    public T getPierwszy() {
        return pierwszy;
    }

    public T getDrugi() {
        return drugi;
    }

    public void zaparkujAuto(T autoDoZaparkowania) {
        if (pierwszy == null) {
            pierwszy = autoDoZaparkowania;
        } else if (drugi == null) {
            drugi = autoDoZaparkowania;
        } else {
            System.out.println("Nie udalo sie zaparkowac, oba miejsca zajete");
        }
    }

    public T wyprowadz(T autoDoWyprowadzenia) throws CarNotFoundException{
        if (autoDoWyprowadzenia.equals(pierwszy)) {
            T temp = pierwszy;
            pierwszy = null;
            return temp;
        } else if (autoDoWyprowadzenia.equals(drugi)) {
            T temp = drugi;
            drugi = null;
            return temp;
        } else {
            throw new CarNotFoundException("Brak takiego poajazdu w garażu - " + autoDoWyprowadzenia);
        }
    }
}
