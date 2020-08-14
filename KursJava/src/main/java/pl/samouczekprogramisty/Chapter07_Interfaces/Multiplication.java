package pl.samouczekprogramisty.Chapter07_Interfaces;

public class Multiplication implements Computation {
    @Override
    public double compute(double x, double y) {
        return x * y;
    }
}
