import java.util.*;

public class Vote {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        obj.nextLine(); // fix newline issue

        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextLine();
        }

        Set<String> duplic = new HashSet<>();
        for (int k = 0; k < size; k++) {
            for (int j = k + 1; j < size; j++) {
                if (arr[k].equals(arr[j])) {
                    duplic.add(arr[k]);
                }
            }
        }

        if (duplic.isEmpty()) {
            System.out.println("No duplicate IP addresses found");
        } else {
            for (String ip : duplic) {
                System.out.println("Duplicate IP found: " + ip);
            }
        }
    }
}

    
