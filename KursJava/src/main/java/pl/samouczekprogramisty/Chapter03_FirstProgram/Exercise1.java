package pl.samouczekprogramisty.Chapter03_FirstProgram;

public class Exercise1 {
    public static String sentence1 = "Jest ciepło";
    public static String sentence2 = "Wieje wiatr z południa";
    public static String sentence3 = "Pada śnieg";

    public static void main(String[] args) {
        System.out.println(sentence1);
        System.out.println(sentence2);
        System.out.println(sentence3);

        System.out.println("Długość powyższych zdań to: " + sumOfAllCharacters() + " znaki");
    }

    public static int sumOfAllCharacters() {
        return sentence1.length() + sentence2.length() + sentence3.length();
    }

}
