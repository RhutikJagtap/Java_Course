//write a java program to print even and odd elements from the array
import java.util.Scanner;

class EvenOddArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int earr[] = new int[size];
        int oddarr[] = new int[size];

        int j = 0, k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                earr[j] = arr[i];
                j++; // for counting size of resultant array
            } else {
                oddarr[k] = arr[i];
                k++; // for counting size of resultant array
            }
        }

        System.out.println("Original Array is");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\nEven Array is");
        for (int i = 0; i < j; i++) {
            System.out.print(earr[i] + "\t");
        }

        System.out.println("\n Odd Array is ");
        for (int i = 0; i < k; i++) {
            System.out.print(oddarr[i] + "\t");
        }

      sc.close();
    }
}
