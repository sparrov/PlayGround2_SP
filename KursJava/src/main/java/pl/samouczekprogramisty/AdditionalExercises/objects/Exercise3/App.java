package pl.samouczekprogramisty.AdditionalExercises.objects.Exercise3;

public class App {
    public static void main(String[] args) {
        MyNumber number1 = new MyNumber(4);
        MyNumber x = new MyNumber(2);
        System.out.println(number1);

        System.out.println(number1.isOdd());
        System.out.println(number1.isEven());
        System.out.println(number1.sqrt());
        System.out.println(number1.pow(number1));
        System.out.println(number1.add(x));
        System.out.println(number1.substract(x));
    }
}
