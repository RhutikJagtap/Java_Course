
//Remove Vowels from a String
import java.util.Scanner;

class RemoveVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
            } else {

                result = result + ch;
            }
        }

        System.out.println("After Removing vowels  String is =" + result);

      sc.close();
    }
}
