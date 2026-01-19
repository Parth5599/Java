package Prectices.PatternPrectices;

public class Pattern2 {
    // Program to print patterns of numbers and stars
    /*
     *
     *   *
     *   *   *
     *   *   *   *   *

     */

    public static void main() {
        int i, j, k=8;

        for (i=0; i<5; i++) {
            System.out.println("\n");

            for (j=0; j<k; j++) {
                System.out.print(" ");
            }
            k = k - 2;

            for (j=0; j<i; j++) {
                System.out.print(" * ");
            }
        }
    }
}

