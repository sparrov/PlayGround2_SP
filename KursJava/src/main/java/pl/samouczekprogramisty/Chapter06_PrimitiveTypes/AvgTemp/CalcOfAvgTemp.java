package pl.samouczekprogramisty.Chapter06_PrimitiveTypes.AvgTemp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalcOfAvgTemp {
    Scanner scanner = new Scanner(System.in);
    BigDecimal[] arrayOfTemps = new BigDecimal[7];

    public void askForTemps() {
        System.out.println("Podaj siedem kolejnych odczytów temperatury:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Podaj odczyt nr: " + (i + 1));
            arrayOfTemps[i] = scanner.nextBigDecimal();
        }
    }

    public BigDecimal calcAvgTemp() {
        askForTemps();
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < 7; i++) {
            sum = sum.add(arrayOfTemps[i]);
        }
        System.out.print("Srednia temperatura wynosi: ");
        return sum.divide(new BigDecimal(arrayOfTemps.length), 5, RoundingMode.FLOOR);
    }

}


