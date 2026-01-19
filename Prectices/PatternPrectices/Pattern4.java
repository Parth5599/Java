package Prectices.PatternPrectices;

public class Pattern4 {
    // Print Floyds triangle
    /*
        1
        1   2
        1   2   3
        1   2   3   4
    */

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
    }
}
