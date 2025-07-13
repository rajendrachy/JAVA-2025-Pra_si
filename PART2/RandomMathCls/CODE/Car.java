package PART2.RandomMathCls.CODE;
//-------------toString------------
public class Car {

    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNo;
    String company;

    // Constructor
    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNo, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNo = modelNo;
        this.company = company;
    }

    // toString method
    @Override
    public String toString() {
        return "Car Details:\n" +
               "Name: " + name + "\n" +
               "Model No: " + modelNo + "\n" +
               "Company: " + company + "\n" +
               "No of Wheels: " + noOfWheels + "\n" +
               "No of Doors: " + noOfDoors + "\n" +
               "Max Speed: " + maxSpeed + " km/h";
    }

    public static void main(String[] args) {
        // Create a Car object using the constructor
        Car car1 = new Car(4, 4, 180, "Sedan", "S123", "Toyota");

        // Print car info using toString()
        System.out.println(car1);  // Calls toString() automatically
    }
}
