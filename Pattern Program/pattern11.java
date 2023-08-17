public class pattern11 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int star = 0; star <= (10 - row); star++) { // logic star <= (9 - row)
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// * * * * * * * * * *
// * * * * * * * * *
// * * * * * * * *
// * * * * * * *
// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *