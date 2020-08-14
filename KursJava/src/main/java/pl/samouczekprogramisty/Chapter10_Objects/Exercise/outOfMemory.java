package pl.samouczekprogramisty.Chapter10_Objects.Exercise;

public class outOfMemory {
    public static void main(String[] args) {

        Integer size = Integer.MAX_VALUE;
        Long[] array = new Long[size];

    }
}
