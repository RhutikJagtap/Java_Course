public class pattern3 {
    public static void main(String[] args) {
        // for (int row = 0; row < 10; row++) {
        // for (int column = 9; column >= 0; column--) {
        // System.out.print(column + " ");
        // }
        // System.out.println();

        // }

        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                System.out.print((9 - column) + " ");
            }
            System.out.println();
        }

    }
}

// 9 8 7 6 5 4 3 2 1 0
// 9 8 7 6 5 4 3 2 1 0
// 9 8 7 6 5 4 3 2 1 0
// 9 8 7 6 5 4 3 2 1 0
// 9 8 7 6 5 4 3 2 1 0
// 9 8 7 6 5 4 3 2 1 0
// 9 8 7 6 5 4 3 2 1 0
// 9 8 7 6 5 4 3 2 1 0
// 9 8 7 6 5 4 3 2 1 0
// 9 8 7 6 5 4 3 2 1 0