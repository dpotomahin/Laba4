package lab4;

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        try {
            int[] test1 = {10, -5, 3, 20, 0};
            System.out.println(solve(test1));

            int[] test2 = {5};
            System.out.println(solve(test2));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static int solve(int[] array) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int value : array) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        return min + max;
    }
}
