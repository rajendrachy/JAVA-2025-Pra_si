package PART4;

 class World implements Runnable {
   public World() {
   }

   public void run() { // RUNNING
      for(int var1 = 0; var1 < 20; ++var1) {
         System.out.println("World");
      }

   }
}


public class Test {
  public static void main(String[] args) {
  
    World world = new World(); // NEW -> when object is created
    Thread t1 = new Thread(world);
    t1.start(); // RUNNABLE -> when start method call


    for(int i=0; i<20; i++) {
    System.out.println("Hello");

    }
  }
}





