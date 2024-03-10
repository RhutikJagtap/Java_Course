//Program how to create Array
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("Enter Size Of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // Declaration and Creation of Array
        int array[] = new int[size];

        System.out.println("Enter Values in Array :");
        for (int index = 0; index < array.length; index++) {
            array[index] = sc.nextInt(); // To Store Values

        }

        // Display Array element using for each loop
        System.out.println("Display Array");
        for (int index : array) {
            System.out.println(index);
        }
    }
}
