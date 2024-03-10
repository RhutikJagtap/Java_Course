
//Program to find Maximum Number in Array
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        System.out.println("Enter Size Of Array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the Array Elements :");
        for (int index = 0; index < array.length; index++) {
            array[index] = sc.nextInt();
        }

        int max = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        System.out.println("Maximum element in array :" + max);

    }
}
