package Prectices;

public class TotalOddNum {
    // Total number of odd numbers between 1 -100

    public static void main(String[] args) {
        int couter = 0;
        for (int i = 0; i<=100; i++) {          // use for loop for get 1 to 100
            if (i % 2 != 0)                     // use if condition number / 2 then modulo is 0
                couter++;                       // if condition is true then counter is +1
        }

        System.out.println("Total Odd Numbers in 1 to 100 : " + couter);
    }
}
