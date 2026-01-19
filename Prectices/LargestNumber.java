package Prectices;

public class LargestNumber {
    // Program to find largest number in an array

    public static void main(String[] args) {
        int [] a = {20, 30, 40, 25, 32};            // Array Elements find Large Element
        int max = a[0];                             // Variable Max Contain a[0] Element

        for (int i=0; i<a.length; i++) {            // I 0 to Array.length

            if (a[i] > max) {                       // Condition array Element is Larger to Max
                max = a[i];                         // Max Contain a[i] Element
            }
        }
        System.out.println("Max Number is :"+max);
    }
}
