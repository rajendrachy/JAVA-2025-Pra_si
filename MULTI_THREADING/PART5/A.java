package PART5;

class B {
    // Some base functionality
}

public class A extends B implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running from class A (implements Runnable).");
    }

    public static void main(String[] args) {
        A obj = new A();       // A is Runnable
        Thread t1 = new Thread(obj); // Pass A to Thread
        t1.start();
    }
}


