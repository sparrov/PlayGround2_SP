package pl.samouczekprogramisty.Chepter09_Exeptions.StackTrace;

public class MethodInteruptedByException {
    public static void main(String[] args) {
        System.out.println("Wykonuję metodę MAIN");
        method1();
    }

    public static void method1() {
        System.out.println("Wykonuję metodę nr 1");
        method2();
    }

    public static void method2() {
        System.out.println("Wykonuję metodę nr 2");
        method3();
    }

    public static void method3() {
        System.out.println("Wykonuję metodę nr 3");
        throw new RuntimeException("Błąd!");
    }
}
