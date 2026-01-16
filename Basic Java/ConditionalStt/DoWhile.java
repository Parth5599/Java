package ConditionalStt;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        // Do While Loop

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter A Number :");
            num = sc.nextInt();
            System.out.println("hear is your number "+num);

        } while ( num >= 0);

        System.out.println("THE END");

        // this are creat a loop for user can inter positive number that loop is run.
    }
}
