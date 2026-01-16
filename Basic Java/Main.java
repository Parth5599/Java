import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Mini Project
        // Ganret Random number and user can guss..

        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNumber;
        do {
            System.out.println("Guss my number (1-100) : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WooHoo ... Correct");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your Number is Too Large..");
            }
            else {
                System.out.println("Your Number is Too Small");
            }
        } while (userNumber >= 0);

        System.out.println("My Number Was "+ myNumber);
    }
}
