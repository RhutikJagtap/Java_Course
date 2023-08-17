public class pattern9 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                System.out.print((char) (106 - row) + " ");
            }
            System.out.println();
        }

    }
}

// j j j j j j j j j j
// i i i i i i i i i i
// h h h h h h h h h h
// g g g g g g g g g g
// f f f f f f f f f f
// e e e e e e e e e e
// d d d d d d d d d d
// c c c c c c c c c c
// b b b b b b b b b b
// a a a a a a a a a a