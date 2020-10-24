package programowanie_zaawansowane.typy_generyczne.zadanie2;

public class MojaLista<E> {

    private E[] tablica;

    public MojaLista(int n) {
        tablica = (E[]) new Object[n]; // obejscie, poniewaz nie da sie stworzyc bezposrednio tablicy typu E, nie zadziala: tablica = new E[n];
    }

    public boolean zawiera(E element) {
        for (E e : tablica) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int rozmiar() {
        int counter = 0;
        for (E e : tablica) {
            if (e != null) {
                counter++;
            }
        }
        return counter;
    }

    public boolean dodaj(E element) {
        /* Dodaj element w pierwsze wolne miejsce
        for (E e : tablica) {
            if (e == null) {
                e = element;
                return true;
            }
        }
        return false; */


        // Dodaj element w wolne miejsce po ostatnim zajętym elemencie
        int ostatniPelnyIndex = -1;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] != null) {
                ostatniPelnyIndex = i;
            }
        }
        if (ostatniPelnyIndex == tablica.length - 1) {
            System.out.println("Ostatni element tablicy jest pelny, nie mam gdzie dodac nowego elementu");
            return false;
        } else {
            tablica[ostatniPelnyIndex + 1] = element;
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (E e : tablica) {
            if (e != null) {
                sb.append(e.toString());
                sb.append(", ");
            }
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(']');

        return sb.toString();
    }
}
