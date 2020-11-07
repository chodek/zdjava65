package programowanie_zaawansowane.klasy_wewnetrzne.klasy_anonimowe.zadanie1;

public class Main {
    public static void main(String[] args) {

    }


    public interface GreetingModule {
        void sayHello();
    }


    public void someMethod(){
        GreetingModule greeting = new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        };
    }
}
