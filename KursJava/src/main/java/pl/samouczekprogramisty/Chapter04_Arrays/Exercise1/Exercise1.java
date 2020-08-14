package pl.samouczekprogramisty.Chapter04_Arrays.Exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = new int[2];
        array[0] = 5;
        array[1] = 10;

        System.out.println(sumOfArray(array));
    }

    public static int sumOfArray(int[] array) {
        return array[0] + array[1];
    }
}
