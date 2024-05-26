//java program to check if two strings are equal or not
import java.util.Scanner;

class StringEquality{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String ");
        String str1 = sc.nextLine();

        System.out.println("Enter Second String ");
        String str2 = sc.nextLine();

        System.out.println();
        if (str1.equals(str2)) {
            System.out.println("Both Strings are equal ");
        } else {
            System.out.println("Strings are not equal ");
        }

        sc.close();
    }
}
