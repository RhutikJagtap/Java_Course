//write a java program to print transpose of matrix
//transpose means we have to change rows into column and columns into rows
import java.util.Scanner;

class TransposeMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter the total number of columns");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        System.out.println("Enter the array elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array elements are ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int transpose[][] = new int[rows][columns];

        // transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[i][j] = arr[j][i];
            }
        }

        System.out.println("Transpose of Matrix ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

      sc.close();
    }
}
