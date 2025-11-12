import java.util.Scanner;


abstract class Payment {
    abstract void processPayment();
}


class CreditCardPayment extends Payment {
    private String cardNumber;
    private double amount;

    CreditCardPayment(String cardNumber,double amount) {
        this.cardNumber = cardNumber;
        this.amount=amount;
    }

    @Override
    void processPayment() {
        System.out.println("Processing credit card payment of $" + amount + " using card number " + cardNumber);
    }
}

// Derived class for PayPal payments
class PayPalPayment extends Payment {
    private String email;
    private double amount;

    PayPalPayment(String email,double amount) {
        this.email = email;
        this.amount=amount;
    }

    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount + " using email " + email);
    }
}
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of payments: ");
        int numPayments = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Payment[] payments = new Payment[numPayments];

        for (int i = 0; i < numPayments; i++) {
            System.out.print("Enter payment method (CreditCard/PayPal): ");
            String method = scanner.nextLine();

            if (method.equalsIgnoreCase("CreditCard")) {
                System.out.print("Enter card number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                payments[i] = new CreditCardPayment(cardNumber,amount);
            
            } else if (method.equalsIgnoreCase("PayPal")) {
                System.out.print("Enter PayPal email: ");
                String email = scanner.nextLine();
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine(); 
                payments[i] = new PayPalPayment(email,amount);
            
            } else {
                System.out.println("Invalid payment method!");
            }
        }

        scanner.close();
    }
}
