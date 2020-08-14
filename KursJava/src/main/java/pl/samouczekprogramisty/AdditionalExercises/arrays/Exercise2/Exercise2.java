package pl.samouczekprogramisty.AdditionalExercises.arrays.Exercise2;

public class Exercise2 {
    //2. Napisz metodę pobierającą trójelementową tablicę liczb,
    // która zwróci tablicę zawierającą te same elementy w odwróconej kolejności

    public static int[] getNumbers() {
        int[] numbers = new int[]{1, 2, 3};
        int[] numbersInOrder = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersInOrder[i] = numbers[2 - i];
        }
        return numbersInOrder;
    }
}
