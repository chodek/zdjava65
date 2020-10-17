package programowanie_podstawy.zadanie3;

public class Main {
    public static void main(String[] args) {

        RachunekBankowy rachunekBankowy = new RachunekBankowy("10", 10, "Marcin", "Chodkowski");
        RachunekBankowy rachunekBankowy2 = new RachunekBankowy("100", 100, "Piotr", "Kowalski");

        Bank mbank = new Bank("mbank", new RachunekBankowy[]{rachunekBankowy, rachunekBankowy2},
                "Jan", "Nowak");

        System.out.println("Stan 1 rachunku to: " + rachunekBankowy.getIloscSrodkow());
        System.out.println("Stan 2 rachunku to: " + rachunekBankowy2.getIloscSrodkow());

        System.out.println("wykonuje przelew na 10 zl");
        mbank.wykonajPrzelew("100","10", 10);

        System.out.println("Stan 1 rachunku to: " + rachunekBankowy.getIloscSrodkow());
        System.out.println("Stan 2 rachunku to: " + rachunekBankowy2.getIloscSrodkow());


    }
}
