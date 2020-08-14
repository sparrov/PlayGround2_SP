package pl.samouczekprogramisty.Chapter06_PrimitiveTypes.AvgMarks;

public class App {
    public static void main(String[] args) {
        AvgOfMarks avg1 = new AvgOfMarks();

        avg1.enterData();
        System.out.println("średnia wszystkich ocen ucznia wynosi: " + avg1.calcAvgGrade());

    }
}
