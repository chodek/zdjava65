package programowanie_zaawansowane.wyjatki.zadanieLiczby;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe:");
        Scanner scanner = new Scanner(System.in);
        double userInput = 0;
        while (true) {
            try {
                userInput = scanner.nextDouble();// i uzyc odpowiedniej metody
                break;
            } catch (InputMismatchException e) {// Jaki wyjatek wtedy musimy zlapac?
                System.out.println("Podaj poprawną liczbę!");
                scanner.next();
            }
        }

        if (userInput < 0) {
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby %.5f nie istnieje", userInput));// Jaki wyjatek powinnismy rzucic z jaka wiadomoscia?
        }
        System.out.println(String.format("Pierwiastek z %.4f to %.4f.", userInput, Math.sqrt(userInput)));
    }
}
