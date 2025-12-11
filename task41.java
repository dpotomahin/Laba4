package lab4;

import java.util.Arrays;

public class Task41 {

    public static void main(String[] args) {
        try {
            double[] test1 = {1.5, 10.0, 5.0, 2.0, 20.0};
            System.out.println(solve(test1));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static double solve(double[] array) {
        if (array == null) {
            throw new NullPointerException("Array cannot be null");
        }
        if (array.length < 3) {
            throw new IllegalArgumentException("Array must have at least 3 elements");
        }

        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return (max + array[2]) / 2.0;
    }
}
