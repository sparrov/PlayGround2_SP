package pl.samouczekprogramisty.AdditionalExercises.objects.Exercise2;

public class App {
    public static void main(String[] args) {
        Rectangle f1 = new Rectangle(3, 4);
        System.out.println(f1.getHeight());
        System.out.println(f1.getLenght());
        System.out.println(f1.computeArea());
        System.out.println(f1.computePerimeter());
        System.out.println(f1.computeDiagonal());
    }
}
