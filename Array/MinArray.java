
//Program to Find Minimum number in array 
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        System.out.println("Enter Size Of Array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
        }
        System.out.println("Minimum element in array :" + max);

    }
}
