package Prectices;

import java.util.Scanner;

public class SumOfDigits {
    // Find the sum of the digits of a number

    public static void main(String[] args) {
        int num=0, rem=0, sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Digits of Number :");
        num = sc.nextInt();
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Single Digit " + temp + "sum is" + sum);
    }
}
