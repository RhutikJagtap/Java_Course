public class pattern6 {
    public static void main(String[] args) {
        // for (char row = 'a'; row < 'k'; row++) {
        // for (char column = 'a'; column < 'k'; column++) {
        // System.out.print(column + " ");
        // }
        // System.out.println();
        // }

        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                System.out.print((char) (97 + column) + " ");
            }
            System.out.println();
        }

    }
}

// a b c d e f g h i j
// a b c d e f g h i j
// a b c d e f g h i j
// a b c d e f g h i j
// a b c d e f g h i j
// a b c d e f g h i j
// a b c d e f g h i j
// a b c d e f g h i j
// a b c d e f g h i j
// a b c d e f g h i j