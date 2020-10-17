package programowanie_podstawy.zadanie3;

public class Bank {

    private String nazwaBanku;
    private RachunekBankowy[] kontaBankowe;
    private String imieWlasciciela;
    private String nazwiskoWlasciciela;

    public Bank(String nazwaBanku, RachunekBankowy[] kontaBankowe, String imieWlasciciela, String nazwiskoWlasciciela) {
        this.nazwaBanku = nazwaBanku;
        this.kontaBankowe = kontaBankowe;
        this.imieWlasciciela = imieWlasciciela;
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
    }

    public void wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu) {

        for (int i = 0; i < kontaBankowe.length; i++) {
            if (kontaBankowe[i].getNumerKonta().equalsIgnoreCase(numerKontaZ)) {
                kontaBankowe[i].wykonajPrzelewWychodzacy(kwotaPrzelewu);
            } else if (kontaBankowe[i].getNumerKonta().equalsIgnoreCase(numerKontaNa)) {
                kontaBankowe[i].wykonajPrzelewPrzychodzacy(kwotaPrzelewu);
            }
        }

    }
}
