package Prectices;

import java.util.Scanner;

public class BillCalculate {
    // Calculate electricity bill

    public static void main(String[] args) {
        // Unit Price is
        // 100 up - rs. 5
        // 200 up - rs. 6
        // 300 up - rs. 8

        int Bill = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Bill Units: ");
        int unit = sc.nextInt();

        if (unit > 100) {
            if (unit >= 200) {
                if (unit > 300) {
                    Bill = unit * 8;
                } else {
                    Bill = unit * 6;
                }
            } else {
                Bill = unit * 5;
            }
        }
        System.out.println("Your Total Bill is : " + Bill);
    }
}
