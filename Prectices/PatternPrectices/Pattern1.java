package Prectices.PatternPrectices;

public class Pattern1 {
    //Program to print patterns of numbers and stars
    /*
    *
    *   *
    *   *   *
    *   *   *   *
    * */

    public static void main(String[] args) {
        int n = 4;

        for (int i=0; i<n; i++) {
            System.out.println("\n");

            for (int j=0; j<=i; j++) {
                System.out.print(" * ");
            }

        }
    }
}
