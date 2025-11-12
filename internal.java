import java.util.Scanner;

public class internal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.trim();

        // Split the string by one or more spaces
        String[] words = s.split("\\s+");

        // Get the last word and print its length
        if (words.length > 0) {
            String lastWord = words[words.length - 1];
            System.out.println("Length of last word: " + lastWord.length());
        } else {
            System.out.println("Length of last word: 0");
        }
    }
}