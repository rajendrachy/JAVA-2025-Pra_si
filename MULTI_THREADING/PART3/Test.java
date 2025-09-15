// thread using a extends------------------

// package PART3;


//  class World extends Thread {
//    public World() {
//    }

//    public void run() {
//       for(int var1 = 0; var1 < 20; ++var1) {
//          System.out.println("World");
//       }

//    }
// }


// public class Test {
//   public static void main(String[] args) {
  
//     World world = new World();
//     world.start();


//     for(int i=0; i<20; i++) {
//     System.out.println("Hello");

//     }
//   }
// }













//---Thread using a implements------------

package PART3;


 class World implements Runnable {
   public World() {
   }

   public void run() {
      for(int var1 = 0; var1 < 20; ++var1) {
         System.out.println("World");
      }

   }
}


public class Test {
  public static void main(String[] args) {
  
    World world = new World();
    Thread t1 = new Thread(world);
    t1.start();


    for(int i=0; i<20; i++) {
    System.out.println("Hello");

    }
  }
}




