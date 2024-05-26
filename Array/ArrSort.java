import java.util.Scanner;

class ArrSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size Of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array is");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }

        // sorting logic
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("\nAscending Array Elements ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
