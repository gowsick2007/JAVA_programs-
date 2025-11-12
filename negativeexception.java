// Custom exception class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class negativeexception {
    
    // Method to validate array elements
    public static void validateArray(int[] arr) throws NegativeNumberException {
        for (int num : arr) {
            if (num < 0) {
                throw new NegativeNumberException("Negative number found: " + num);
            }
        }
        System.out.println("All numbers are non-negative.");
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 8, 12};

        try {
            validateArray(numbers);
        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Validation completed.");
        }
    }
}
