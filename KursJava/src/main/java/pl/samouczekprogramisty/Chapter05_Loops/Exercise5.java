package pl.samouczekprogramisty.Chapter05_Loops;

public class Exercise5 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sumOfArray(array));

    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
