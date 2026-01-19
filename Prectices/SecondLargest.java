package Prectices;

public class SecondLargest {
    // Program to find second largest number in an array

    public static void main(String[] args) {
        int [] a = {20, 30, 40, 25, 32};            // Array Elements find Second Large Element
        int large = a[0];
        int secondLarge = a[0];

        System.out.println("The Array is : ");      // Print Array Element
        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

        for (int i=0; i<a.length; i++) {

            if (a[i] > large) {                     // Compare Element to Large element
                secondLarge = large;
                large = a[i];
            }
            else if (a[i] > secondLarge) {          // Compare Element to SecondLarge element
                secondLarge = a[i];
            }
        }
        System.out.println("Second Large Element is :" + secondLarge);
    }
}
