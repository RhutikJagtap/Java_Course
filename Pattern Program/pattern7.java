public class pattern7 {
    public static void main(String[] args) {
        // for (char row = 'a'; row < 'k'; row++) {
        // for (char column = 'j'; column >= 'a'; column--) {
        // System.out.print(column + " ");
        // }
        // System.out.println();
        // }

        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                System.out.print((char) (106 - column) + " ");
            }
            System.out.println();
        }

    }
}

// j i h g f e d c b a
// j i h g f e d c b a
// j i h g f e d c b a
// j i h g f e d c b a
// j i h g f e d c b a
// j i h g f e d c b a
// j i h g f e d c b a
// j i h g f e d c b a
// j i h g f e d c b a
// j i h g f e d c b a