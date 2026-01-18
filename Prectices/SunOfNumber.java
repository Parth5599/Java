package Prectices;

import java.util.Scanner;

public class SunOfNumber {
    // Find sum of first n numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.println("Enter N Number :");         // Get a ' N ' Number for user
        n = sc.nextInt();

        for (int i=0; i<=n; i++) {                      // use loop for get 1 to N numbers
            sum = sum + i;                              // sum for sum + i
        }

        System.out.println("Total Number Of Sum is : " + sum);
    }
}
