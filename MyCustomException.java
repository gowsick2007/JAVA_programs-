// User-defined exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class MyCustomException {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            // Example of ArithmeticException
            int result = a / b; // This will throw ArithmeticException

            // Example of custom exception trigger (unreachable in this example)
            if (a > 5) {
                throw new CustomException("Value of 'a' is too large!");
            }

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
