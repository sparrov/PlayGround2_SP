package pl.samouczekprogramisty.Chapter04_Arrays.Exercise4;

import java.util.Arrays;

public class Exercise4 {
    public static final int EMPTY = 0;

    public static final int B_KING = 1;
    public static final int B_QUEEN = 2;
    public static final int B_BISHOP = 3;
    public static final int B_KNIGHT = 4;
    public static final int B_ROOK = 5;
    public static final int B_PAWN = 6;

    public static final int W_KING = 7;
    public static final int W_QUEEN = 8;
    public static final int W_BISHOP = 9;
    public static final int W_KNIGHT = 10;
    public static final int W_ROOK = 11;
    public static final int W_PAWN = 12;

    public static int[][] game5FinalState() {
        return new int[][]{
                new int[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{B_PAWN, B_PAWN, EMPTY, EMPTY, EMPTY, EMPTY, W_PAWN, EMPTY},
                new int[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{EMPTY, B_KING, B_PAWN, EMPTY, EMPTY, W_KNIGHT, EMPTY, EMPTY},
                new int[]{EMPTY, B_KNIGHT, EMPTY, EMPTY, W_ROOK, EMPTY, W_PAWN, EMPTY},
                new int[]{EMPTY, EMPTY, EMPTY, B_ROOK, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{EMPTY, W_KING, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
        };
    }

    public static void main(String[] args) {

        int[][] finalState = game5FinalState();
        System.out.println(Arrays.deepToString(finalState));
    }

}
