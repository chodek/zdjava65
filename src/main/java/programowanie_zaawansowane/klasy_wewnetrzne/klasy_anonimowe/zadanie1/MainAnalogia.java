package programowanie_zaawansowane.klasy_wewnetrzne.klasy_anonimowe.zadanie1;

public class MainAnalogia {
    public static void main(String[] args) {

    }

    public interface GreetingModule{
        void sayHello();
    }

    public class GreetingModuleImplementation implements GreetingModule {
        @Override
        public void sayHello(){
            System.out.println("good morning");
        }
    }

    public void someMethod(){
        GreetingModule greeting = new GreetingModuleImplementation();
    }
}
