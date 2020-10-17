package programowanie_podstawy.zadanie19;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Brzechwa", "Polish");
        Author kochanowski = new Author("Kochanowski", "Polish");


        Poem poem1 = new Poem(author1, 40);
        Poem poem2 = new Poem(kochanowski, 10);
        Poem poem3 = new Poem(kochanowski, 15);
        Poem poem4 = new Poem(new Author("Mickiewicz", "Polish"), 1);


        Poem[] tableOfPoems = new Poem[]{poem1, poem2, poem3, poem4};

        int indexOfLongestPoem = -1;
        int localMaxOfStrophesNumber = -1;
        for (int i = 0; i < tableOfPoems.length; i++) {
            if (tableOfPoems[i].getStropheNumbers() > localMaxOfStrophesNumber) {
                localMaxOfStrophesNumber = tableOfPoems[i].getStropheNumbers();
                indexOfLongestPoem = i;
            }
        }

        System.out.println(tableOfPoems[indexOfLongestPoem].getCreator().getSurname());
    }
}
