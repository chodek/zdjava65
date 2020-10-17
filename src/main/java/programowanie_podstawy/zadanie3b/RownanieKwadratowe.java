package programowanie_podstawy.zadanie3b;

public class RownanieKwadratowe {

    int a, b, c;
    double delta;
    double x1, x2;


    public RownanieKwadratowe(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obliczDelte() {
        this.delta = Math.pow(b, 2) - 4 * a * c;
    }


    public void wypiszPierwiastki() {
        if (x1 == 0 && x2 == 0) {
            obliczPierwiastki();
        }
        System.out.println("Pierwiastki to x1: " + x1 + ", a x2 to: " + x2);
    }


    private void obliczPierwiastki() {
        obliczDelte();
        this.x1 = ((-1) * this.b - Math.sqrt(delta)) / (2 * a);
        this.x2 = ((-1) * this.b + Math.sqrt(delta)) / (2 * a);
    }

}
