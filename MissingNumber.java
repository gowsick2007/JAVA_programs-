import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you have (n): ");
        int n = sc.nextInt();  // Number of elements (should be n if 1 number is missing from n+1)

        int[] arr = new int[n];
        System.out.println("Enter the " + n + " numbers (from 1 to " + (n + 1) + " with one missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int total = (n + 1) * (n + 2) / 2;
        for (int num : arr) {
            total -= num;
        }

        System.out.println("Missing number is: " + total);
    }
}

