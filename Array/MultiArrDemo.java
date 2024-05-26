import java.util.Scanner;

class MultiArrDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter the total number of columns");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        System.out.println("Enter array elements ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
