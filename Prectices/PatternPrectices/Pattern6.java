package Prectices.PatternPrectices;

public class Pattern6 {
    // Print numbers in pyramid vice
    /*      1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1           */

    public static void main(String[] args) {
        int n = 1;

        for (int i=0; i<5; i++) {
            System.out.println("\n");

            for (int j=0; j<=i; j++) {
                System.out.print(n + " ");
                n ++;
            }
            n = 1;
        }
        for (int i=4; i>=n; i--) {
            System.out.println("\n");

            for (int j=1; j<=i; j++) {
                System.out.print(n +" ");
                n++;

            }
            n = 1;
        }
    }
}
