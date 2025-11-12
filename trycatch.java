import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class trycatch
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();

        String[] elements = scanner.nextLine().split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }

        int index = scanner.nextInt();
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();

        scanner.close();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }

        try {
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds.");
        }

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}