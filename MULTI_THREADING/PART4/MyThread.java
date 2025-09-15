package PART4;

public class MyThread extends Thread{

         @Override
         public void run() {
    System.out.println("Running state");

    try{
       Thread.sleep(2000);

    } catch(InterruptedException e) {
       System.out.println(e);
    }
        }


 public static void main(String[] args)  throws InterruptedException{
    MyThread t1 = new MyThread();
    System.out.println(t1.getState()); // NEW


    t1.start();
    System.out.println(t1.getState()); // RUNNABLE


    //System.out.println(Thread.currentThread().getState()); // RUNNABLE


    Thread.sleep(100);

    System.out.println(t1.getState()); //TIMED_WAITING


    t1.join(); // main method is waiting for t1 for the waiting
    
    System.out.println(t1.getState());  //TERMINATED


  }
}


