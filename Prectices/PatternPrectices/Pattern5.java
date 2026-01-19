package Prectices.PatternPrectices;

public class Pattern5 {
    // Print Floyds triangle
    /*
        1   2   3   4
        1   2   3
        1   2
        1
    */

    public static void main(String[] args) {

        int n = 1;
        int c = 1;

        for (int i=4; i>=n; i--) {
            System.out.println("\n");

            for (int j=1; j<=i; j++) {
                System.out.print(c +" ");
                c++;

            }
            c = 1;
        }
    }
}
