public class pattern13 {
    public static void main(String[] args) {
        // for (int row = 0; row < 10; row++) {
        // for (int column = 0; column <= row; column++) {
        // System.out.print((9 - column) + " ");

        // }
        // System.out.println();
        // }

        for (int row = 0; row < 10; row++) {
            for (int column = 9; column >= (9 - row); column--) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        // for (int row = 9; row >= 0; row--) {
        // for (int column = 9; column >= row; column--) {
        // System.out.print(column + " ");
        // }
        // System.out.println();
        // }
    }
}

// 9
// 9 8
// 9 8 7
// 9 8 7 6
// 9 8 7 6 5
// 9 8 7 6 5 4
// 9 8 7 6 5 4 3
// 9 8 7 6 5 4 3 2
// 9 8 7 6 5 4 3 2 1
// 9 8 7 6 5 4 3 2 1 0