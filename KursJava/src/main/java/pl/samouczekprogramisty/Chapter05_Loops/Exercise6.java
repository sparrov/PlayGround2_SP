package pl.samouczekprogramisty.Chapter05_Loops;

public class Exercise6 {
    public static int[][] array = new int[][]{
            new int[]{1, 2, 3},
            new int[]{4, 5, 6},
            new int[]{7, 8, 9},
            new int[]{10, 11, 12},
    };

    public static void main(String[] args) {
        System.out.println(sumOfArray(array));
    }

    public static int sumOfArray(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }

}
