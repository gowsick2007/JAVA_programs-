import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
int rev=0;
        for (int i=arr.length-1;i>=0;i--){
        System.out.println("Reversed Array: " +arr[i]);
        sc.close();
    }       
    Arrays.sort(arr);
if (arr.length >= 2) {
    System.out.println("Second smallest: " + arr[1]);
    System.out.println("Second largest: " + arr[arr.length - 2]);
} else {
    System.out.println("Not enough elements.");
}

        
    
}
}
