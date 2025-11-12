class Account {
    int balance = 1000;

      synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

      synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Tried to withdraw " + amount + " - Not enough balance!");
        }
    }  }

class DepositThread extends Thread {
    Account account;
    public void run() {
        account.deposit(500);
    }  }

class WithdrawThread extends Thread {
    Account account;
    public void run() {
        account.withdraw(700);
    }
}


public class sync
{
    public static void main(String[] args) {
        Account acc = new Account();

        DepositThread d = new DepositThread();
        WithdrawThread w1 = new WithdrawThread();
        WithdrawThread w2 = new WithdrawThread();

        // Set the shared account directly
        d.account = acc;
        w1.account = acc;
        w2.account=acc;

        d.start();
        w1.start();
        w2.start();
       
        System.out.println(acc.balance);
    }
    
}