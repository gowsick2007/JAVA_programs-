import java.util.Scanner;
public class Negativenumcheck
 {
    public static void main(String[] args)throws IllegalArgumentException
     {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        try
         {
             if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");

        }else{
            System.out.println("the number is valid");
        }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
