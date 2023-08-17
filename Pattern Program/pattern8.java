public class pattern8 {
    public static void main(String[] args) {
        // for (char row = 'a'; row < 'k'; row++) {
        // for (char column = 'a'; column < 'k'; column++) {
        // System.out.print(row + " ");
        // }
        // System.out.println();
        // }

        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                System.out.print((char) (97 + row) + " ");
            }
            System.out.println();
        }
    }
}

// a a a a a a a a a a
// b b b b b b b b b b
// c c c c c c c c c c
// d d d d d d d d d d
// e e e e e e e e e e
// f f f f f f f f f f
// g g g g g g g g g g
// h h h h h h h h h h
// i i i i i i i i i i
// j j j j j j j j j j
