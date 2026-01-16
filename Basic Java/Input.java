import java.util.Scanner; // Import Scanner 

public class Input {

    public static void main(String[] args) {
        // How to take INPUT

        Scanner sc = new Scanner(System.in);
        // System.out.println("Input You Age : ");
        // float age = sc.nextFloat();
        // System.out.println(age);

        System.out.println("Enter Your Name : ");
        // String name = sc.next(); // .next() is contain a single word
        String name = sc.nextLine(); // .nextLine() contain a full sentence
        System.out.println(name);

    }
}
