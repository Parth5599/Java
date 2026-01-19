package Prectices.PatternPrectices;

public class NumberSequence {
    // Print numbers in sequence way
    //  4   3   7
    //  7   4   11
    //  11  5   16
    //  16  6   22
    // .....

    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int n = 8;

        for (int i=0; i<n; i++) {

            int c = a+b;
            System.out.print(a +" "+ b +" "+ c);
            System.out.println(" ");

            a = c;
            b = b + 1;
        }
    }
}
