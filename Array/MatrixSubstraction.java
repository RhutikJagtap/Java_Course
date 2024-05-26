import java.util.Scanner;

class MatrixSubstraction {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows :");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns :");
        int columns = sc.nextInt();

        int A[][] = new int[rows][columns];
        int B[][] = new int[rows][columns];

        System.out.println("Enter the First Matrix Value :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Second Matrix value :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int result[][] = new int[rows][columns];

        System.out.println("Addition of Matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
