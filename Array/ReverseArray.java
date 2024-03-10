
//Reverse Array element 
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter Array Element:");
        for (int index = 0; index < array.length; index++) {
            array[index] = sc.nextInt();
        }

        System.out.println("Reverse Array is : ");
        for (int index = array.length - 1; index >= 0; index--) { // i must be array.length-1 because Exception in
                                                                  // thread
            // "main"
            // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds
            // for length 3
            System.out.println(array[index]);
        }

    }
}
