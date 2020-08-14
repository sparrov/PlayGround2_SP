package pl.samouczekprogramisty.Chapter07_Interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        } else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    Scanner scanner = new Scanner(System.in);

    private boolean shouldMultiply() {
        System.out.println("Jakie działanie chciałbyś wykonać?");
        System.out.println("1 - mnożenie");
        System.out.println("2 - dodawanie");
        int anwser = scanner.nextInt();
        if (anwser == 1) {
            return true;
        } else {
            return false;
        }
    }

    private double getArgument() {
        System.out.println("Podaj argument:");
        int x = scanner.nextInt();
        return x;
    }
}
