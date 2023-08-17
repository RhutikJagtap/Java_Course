public class pattern5 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                System.out.print((9 - row) + " ");
            }
            System.out.println();
        }
    }
}

// 9 9 9 9 9 9 9 9 9 9
// 8 8 8 8 8 8 8 8 8 8
// 7 7 7 7 7 7 7 7 7 7
// 6 6 6 6 6 6 6 6 6 6
// 5 5 5 5 5 5 5 5 5 5
// 4 4 4 4 4 4 4 4 4 4
// 3 3 3 3 3 3 3 3 3 3
// 2 2 2 2 2 2 2 2 2 2
// 1 1 1 1 1 1 1 1 1 1
// 0 0 0 0 0 0 0 0 0 0
