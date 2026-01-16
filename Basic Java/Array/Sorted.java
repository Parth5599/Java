package Array;

import java.util.Arrays;

public class Sorted {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[0]);

        // Sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}
