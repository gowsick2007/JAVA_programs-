import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class nestedtrycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fileName = sc.nextLine();
        String[] elements = sc.nextLine().split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        int index = sc.nextInt();
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        sc.close();

        // File handling
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        // Array index access
        try {
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds.");
        }

        // Division
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
