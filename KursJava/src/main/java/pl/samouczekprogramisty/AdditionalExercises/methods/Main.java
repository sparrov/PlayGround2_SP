package pl.samouczekprogramisty.AdditionalExercises.methods;

public class Main {

    public static void main(String[] args) {

        System.out.println(getMyAge());
        System.out.println(getMyName());
        computeTwoNumbers(5, 4);
        System.out.println(isEven(5));
        System.out.println(isDivisibleByThreeAndFive(15));
        System.out.println(computeThirdPowerOfNumber(3));
        System.out.println(computeSquareRootOfNumber(4));
        System.out.println(isRectangularTriangle(3, 4, 5));

    }

    //1. Napisz metodę, która zwróci Twój aktualny wiek.
    public static int getMyAge() {
        return 35;
    }

    //2. Napisz metodę, która zwróci Twoje imię,
    public static String getMyName() {
        return "Szymon";
    }

    //3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,
    public static void computeTwoNumbers(int a, int b) {
        System.out.println("Suma: " + a + " + " + b + " = " + (a + b));
        System.out.println("Różnica: " + a + " - " + b + " = " + (a - b));
        System.out.println("Iloczyn: " + a + " * " + b + " = " + (a * b));
    }

    //4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,
    public static boolean isDivisibleByThreeAndFive(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
    public static double computeThirdPowerOfNumber(double x) {
        return Math.pow(x, 3);
    }

    //7. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
// (poczytaj javadoc do klasy Math, znajdziesz tam metodę, która na pewno Ci pomoże),
    public static double computeSquareRootOfNumber(double x) {
        return Math.sqrt(x);
    }

    //8.Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true
    // jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
    public static boolean isRectangularTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        int cathetus1 = a;
        int cathetus2 = b;
        int hypotenuse = c;

        if (a >= b && b <= a && a < c) {
            cathetus1 = a;
            cathetus2 = b;
            hypotenuse = c;
        } else if (a <= b && b >= a && b < c) {
            cathetus1 = a;
            cathetus2 = b;
            hypotenuse = c;
        }
        if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
            return true;
        } else {
            return false;
        }
    }

}
