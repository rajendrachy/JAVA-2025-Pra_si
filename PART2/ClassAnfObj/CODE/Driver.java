package PART2.ClassAnfObj.CODE;

// -----------Driver Object-------------------
public class Driver {

  public static void main(String[] args) {
    Car myCar = new Car(); // Car class reference defined => myCar
    myCar.drive();
    System.out.println(myCar.getCurrFuel());

  }
}


// --------Car Object-------------
 class Car {
 int noOfWheels;
 String color;
 float maxSpeed;
 float currentFuel;
 int noOfSeat;


 public void drive() {

  if(currentFuel <= 0) {
    System.out.println("Car is out of fuel");
      currentFuel--;

  } else if(currentFuel < 5) {
    System.out.println("Car is reserve in reserved mode");
      currentFuel--;

  }
  System.out.println("Car is driving");
 }


 public void addFuel(float fuel) {
currentFuel += fuel;
 }


 public float getCurrFuel() {
  return currentFuel;
 }
}











