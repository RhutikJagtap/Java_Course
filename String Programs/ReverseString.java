import java.util.Scanner;

class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = sc.nextLine();

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }

        System.out.println("Reverse String is :" + reverse);
        sc.close();
    }
}
