package pl.samouczekprogramisty.Chapter04_Arrays.Exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        int[] array = {8, 2, 6};
        System.out.println(maxOfArray(array));
    }

    public static int maxOfArray(int[] array) {
        int max = array[0];
        if (array[1] > max) {
            max = array[1];
        }
        if (array[2] > max) {
            max = array[2];
        }
        return max;
    }
}
