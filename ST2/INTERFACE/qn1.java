
import java.lang.module.ModuleReader;

interface Vehicle {
  void startEngine();
  void stopEngine();
}


class Car {
     public void startEngine() {
      System.out.println("Car engine started");
     }

     public void stopEngine() {
      System.out.println("Car engine stopped");
     }
}




class Motorcycle{
       public void startEngine() {
      System.out.println("Motorcycle engine started");
     }

     public void stopEngine() {
      System.out.println("Motrcycle engine stopped");
     }
}


public class qn1 {
  public static void main(String[] args) {
       Car c = new Car();
       Motorcycle m = new Motorcycle();
  

       c.startEngine();
       c.stopEngine();
       
System.out.println();

       m.startEngine();
       m.startEngine();

       };
  }





  
  


