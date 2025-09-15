package PART6;

public class MyThread extends Thread{

  @Override
  public void run() {
    for(int i=1; i<=5; i++) {
      try{
        Thread.sleep(1000); // stop 1 sec then print
      } catch(InterruptedException e) {
        System.out.println(e);
      }
      System.out.println(i);
    }
  }
  public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.start();
    
  }
}








