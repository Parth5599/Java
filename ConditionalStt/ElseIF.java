package ConditionalStt;

import java.util.Scanner;

public class ElseIF {

    public static void main(String[] args){
        // Condition Statement

        Scanner sc = new Scanner(System.in);
        // pen = 10; book = 40;

        System.out.println("Enter Your Case :");
        int Case = sc.nextInt();

        if (Case < 10){
            System.out.println("cannot buy anything");
            System.out.println("Get More Case");
        } else if (Case > 10 && Case < 50) {
            System.out.println("Buy Any One Item ");
        }
        else
            System.out.println("Can get both");

    }
}
