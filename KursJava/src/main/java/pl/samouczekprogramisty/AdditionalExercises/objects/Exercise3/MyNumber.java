package pl.samouczekprogramisty.AdditionalExercises.objects.Exercise3;

public class MyNumber {
    private double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public boolean isOdd() {
        return number % 2 == 0;
    }

    public boolean isEven() {
        return number % 2 != 0;
    }

    public double sqrt() {
        return Math.sqrt(number);
    }

    public MyNumber pow(MyNumber x) {
        return new MyNumber(Math.pow(number, x.number));
    }

    public MyNumber add(MyNumber x) {
        return new MyNumber(number + x.number);
    }

    public MyNumber substract(MyNumber x) {
        return new MyNumber(this.number - x.number);
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "number=" + number +
                '}';
    }
}
