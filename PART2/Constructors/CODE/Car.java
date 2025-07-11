// package PART2.Constructors.CODE;

// public class Car{
//  int noOfWheels;
//  static String color;
//  float maxSpeed;
//  float currentFuel;
//  int noOfSeat;


//  public static void main(String[] args) {
//   Car myCar = new Car(3.0f);
//   myCar.addFuel(7);
//   myCar.drive();
//   System.out.println("Current Fuel: " + myCar.getCurrFuel());
//   System.out.println(Car.color); // Accessing static variable directly
//   System.out.println("Max Speed: " + myCar.maxSpeed);
//  }








//  //default constructor
//  // This constructor is automatically created by Java if no other constructors are defined.
// //  Car() {
// //   this.noOfWheels = 4; // default value for a car
// //   color = "White"; // default color
// //   this.maxSpeed = 120.0f; // default max speed
// //   this.currentFuel = 0.0f; // initially no fuel
// //   this.noOfSeat = 5; // default number of seats
// //  }






// //Parameterized constructor
//  public Car(float maxspeed)  {
//   this.noOfWheels = 9;
//   Car.color = "Black"; // static variable
//   this.maxSpeed = maxspeed;
//   this.currentFuel = 6;
//   this.noOfSeat = 2;
//  }


 

//  public void drive() {
//   System.out.println("Car is driving");
//   currentFuel--;
//  }


//  public void addFuel(float fuel) {
// currentFuel += fuel;
//  }


//  public float getCurrFuel() {
//   return currentFuel;
//  }
// }



















//-----------------one class has multiple constructors------------------

// package PART2.Constructors.CODE;

// public class Car{
//  int noOfWheels;
//  static String color;
//  float maxSpeed;
//  float currentFuel;
//  int noOfSeat;


//  public static void main(String[] args) {
//   Car myCar = new Car(3.0f);
//   myCar.addFuel(7);
//   myCar.drive();
//   System.out.println("Current Fuel: " + myCar.getCurrFuel());
//   System.out.println(Car.color); // Accessing static variable directly
//   System.out.println("Max Speed: " + myCar.maxSpeed);

//   Car myCar2 = new Car();
//   myCar2.addFuel(5);
//   myCar2.drive();
//   System.out.println("Current Fuel of myCar2: " + myCar2.getCurrFuel());
//   System.out.println(Car.color); // Accessing static variable directly
//  }






// //Parameterized constructor
//  public Car(float maxspeed)  {
//   this.noOfWheels = 9;
//   Car.color = "Black"; // static variable
//   this.maxSpeed = maxspeed;
//   this.currentFuel = 6;
//   this.noOfSeat = 2;
//  }


//  // Default constructor
//  public Car()  {
//   this.noOfWheels = 9;
//   Car.color = "Black"; // static variable
//   this.maxSpeed = 3.0f;
//   this.currentFuel = 6;
//   this.noOfSeat = 2;
//  }

 

//  public void drive() {
//   System.out.println("Car is driving");
//   currentFuel--;
//  }


//  public void addFuel(float fuel) {
// currentFuel += fuel;
//  }


//  public float getCurrFuel() {
//   return currentFuel;
//  }
// }




















//-------------------using this keyword constructor calling-------------------

package PART2.Constructors.CODE;

public class Car{
 int noOfWheels;
 static String color;
 float maxSpeed;
 float currentFuel;
 int noOfSeat;


 public static void main(String[] args) {
  Car myCar = new Car(3.0f);
  myCar.addFuel(7);
  myCar.drive();
  System.out.println("Current Fuel: " + myCar.getCurrFuel());
  System.out.println(Car.color); // Accessing static variable directly
  System.out.println("Max Speed: " + myCar.maxSpeed);

  Car myCar2 = new Car();
  myCar2.addFuel(5);
  myCar2.drive();
  System.out.println("Current Fuel of myCar2: " + myCar2.getCurrFuel());
  System.out.println(Car.color); // Accessing static variable directly
 }






//Parameterized constructor
 public Car(float maxspeed)  {
  this.noOfWheels = 9;
  Car.color = "Black"; // static variable
  this.maxSpeed = maxspeed;
  this.currentFuel = 6;
  this.noOfSeat = 2;
 }


 // Default constructor
 public Car()  {
  // Calling the parameterized constructor using 'this'
  // this should be call first line in the constructor othetwise error occure
  this(3.0f); // Calling the parameterized constructor
 noOfSeat = 2;
  currentFuel = 6;
  color = "Black"; // static variable
  System.out.println("Default constructor called");
 }


 

 public void drive() {
  System.out.println("Car is driving");
  currentFuel--;
 }


 public void addFuel(float fuel) {
currentFuel += fuel;
 }


 public float getCurrFuel() {
  return currentFuel;
 }
}

