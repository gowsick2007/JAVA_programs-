import java.util.*;
class Fibnachi extends Thread {
    private int n;

    public Fibnachi(int n) {
        this.n = n;
    }

    public void run() {
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < n; i++) {
            int next = a + b;
            System.out.print(next +"");
            a = b;
            b = next;
        }
        System.out.println();
    }
}
 class fibnachi{
    public static void main(String[] args) {
Scanner a=new Scanner(System.in);
int n=a.nextInt();
        Fibnachi f=new Fibnachi(n);
        f.start();
    }
}