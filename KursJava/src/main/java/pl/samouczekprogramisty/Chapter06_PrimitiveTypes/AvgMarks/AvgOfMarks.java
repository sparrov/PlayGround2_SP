package pl.samouczekprogramisty.Chapter06_PrimitiveTypes.AvgMarks;

import java.util.Scanner;

public class AvgOfMarks {
    int[][] pupilGrades = new int[3][4];

    public void enterData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < pupilGrades.length; i++) {
            System.out.println("Wprowadź oceny z przedmiotu nr " + (i + 1) + "...");
            for (int j = 0; j < pupilGrades[i].length; j++) {
                System.out.print("Podaj ocenę nr " + (j + 1) + " i naciśnij enter aby zatwieddzić: ");
                pupilGrades[i][j] = scanner.nextInt();
            }
        }
    }

    public double calcAvgGrade() {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < pupilGrades.length; i++) {
            for (int j = 0; j < pupilGrades[i].length; j++) {
                sum = sum + pupilGrades[i][j];
                counter++;
            }
        }
        return (double) sum / counter;
    }


}
