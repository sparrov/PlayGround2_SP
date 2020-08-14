package pl.samouczekprogramisty.Chapter01_Methods.Exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(isTemperaturePossitive(10));
        System.out.println(isTemperaturePossitive(-10));

    }

    public static boolean isTemperaturePossitive(int temperature) {
        boolean isPossitive = temperature > 0;

        if (isPossitive) {
            System.out.println("Temperatura jest dodatnia");
        } else {
            System.out.println("Temperatura nie jest dodatnia");
        }
        return isPossitive;

    }
}
