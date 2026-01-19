package Prectices;

import java.util.Scanner;

public class ArmstrongNumber {
    // Java program to find Armstrong number

    public static void main(String[] args) {
        int n, rem, arg, sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Digit Number : ");
        n = sc.nextInt();

        arg = n;
        for (int i=1; i<n; i++) {
            while (n > 0) {
                rem = n % 10;
                sum = sum + (rem*rem*rem);
                n = n / 10;

            }
        }
        if (arg == sum) {
            System.out.println("Given number is Armstrong : " + arg);
        }
        else {
            System.out.println("Given number id not Armstrong : "+ arg);
        }
    }
}
