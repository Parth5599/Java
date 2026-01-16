package ExceptionHandling;

import java.lang.classfile.instruction.ExceptionCatch;
import java.util.Arrays;

public class Exception extends Throwable {

    public static void main(String[] args) {
        // Try - Catch in Exception Handling
        int[] marks = { 97, 98, 95 };
        try {
            System.out.println(marks[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // do something
        }

        System.out.println("The name is Omneky");
    }
}
