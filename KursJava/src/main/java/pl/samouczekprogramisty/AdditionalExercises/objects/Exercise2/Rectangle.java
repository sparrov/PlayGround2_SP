package pl.samouczekprogramisty.AdditionalExercises.objects.Exercise2;

public class Rectangle {
    private double lenght;
    private double height;

    public Rectangle(double lenght, double height) {
        this.lenght = lenght;
        this.height = height;
    }

    public double getLenght() {
        return lenght;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea() {
        return lenght * height;
    }


    public double computePerimeter() {
        return (lenght * 2) + (height * 2);
    }

    public double computeDiagonal() {
        return Math.sqrt(Math.pow(lenght, 2) + Math.pow(height, 2));
    }

}
