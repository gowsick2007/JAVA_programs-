class Multiplication {
    void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println( "  " + n + " * " + i + " = " + (n * i));
            try {
                Thread.sleep(100); // adding a small delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Multiplication m;

    MyThread1(Multiplication m) {
        this.m = m;
    }

    public void run() {
        m.printTable(2);
    }
}

class MyThread2 extends Thread {
    Multiplication m;

    MyThread2(Multiplication m) {
        this.m = m;
    }

    public void run() {
        m.printTable(5);
    }
}

public class threads {
    public static void main(String[] args) {
        Multiplication obj = new Multiplication(); // only one object

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);


        t1.start();
        t2.start();
    }
}

