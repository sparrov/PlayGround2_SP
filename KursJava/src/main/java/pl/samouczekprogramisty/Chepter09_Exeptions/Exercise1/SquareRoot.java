package pl.samouczekprogramisty.Chepter09_Exeptions.Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {
    //Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia pierwiastka
    // możesz użyć istniejącej metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną
    // rzuć wyjątek java.lang.IllegalArgumentException.
    // Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.

    public void computeSquareRoot() {
        Scanner scanner = new Scanner(System.in);
        boolean isUserNumberNotCorrect = true;
        do {
            System.out.print("Podaj liczbę, której pierwiastek ma zostać obliczony: ");
            try {
                double userNumber = scanner.nextDouble();
                if (userNumber < 0) {
                    throw new IllegalArgumentException("Nieprawidlowe dane! Pierwiastek nie może być liczbą ujemną!");
                }
                isUserNumberNotCorrect = false;

                System.out.print("Pierwiastek kwadratowy z liczby " + userNumber + " wynosi: ");
                System.out.println(Math.sqrt(userNumber));
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Wprowadzono nieprawidłowe dane! Wprowadź liczbę...");
            }
        }
        while (isUserNumberNotCorrect);
    }
}
