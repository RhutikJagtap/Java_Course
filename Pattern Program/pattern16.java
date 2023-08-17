public class pattern16 {
    public static void main(String[] args) {
        for (char row = 'A'; row <= 'J'; row++) {
            for (char column = 'A'; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}

// A
// A B
// A B C
// A B C D
// A B C D E
// A B C D E F
// A B C D E F G
// A B C D E F G H
// A B C D E F G H I
// A B C D E F G H I J