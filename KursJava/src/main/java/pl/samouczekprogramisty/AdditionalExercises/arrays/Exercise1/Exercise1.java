package pl.samouczekprogramisty.AdditionalExercises.arrays.Exercise1;

public class Exercise1 {
    //1. Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu,
    private String alphabet = "ABCDEFGHIJKLMNOPRSTUWYZ";


    public String[] getFiveFirstLettersOfAplhabet() {
        String[] arrayOfStrings = new String[5];
        for (int i = 0; i < 5; i++) {
            arrayOfStrings[i] = String.valueOf(alphabet.charAt(i));
        }
        return arrayOfStrings;
    }
}
