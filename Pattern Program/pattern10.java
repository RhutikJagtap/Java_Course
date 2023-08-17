public class pattern10 {
    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int star = 0; star <= row; star++) { // logic star <= row
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// *
// * *
// * * *
// * * * *
// * * * * *
// * * * * * *
// * * * * * * *
// * * * * * * * *
// * * * * * * * * *
// * * * * * * * * * *
