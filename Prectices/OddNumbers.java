package Prectices;

public class OddNumbers {
    // Display odd numbers between 1 -100

    public static void main(String[] args) {
        System.out.println("The Odd Number are :");
        for (int i=0; i<=100; i++) {            // use for loop for get 1 to 100
            if (i % 2 != 0)                     // use if condition number / 2 then modulo is 0
                System.out.println(i);
        }
    }
}
