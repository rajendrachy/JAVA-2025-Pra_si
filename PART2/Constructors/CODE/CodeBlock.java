package PART2.Constructors.CODE;

public class CodeBlock {
    int noOfWheels;
    static String color;
    float maxSpeed;
    float currentFuel;
    int noOfSeat;

    // Static variable to count number of CodeBlock objects created
    static int noOfCatSold;

    // ✅ Static block — runs once when class is loaded
    static {
        noOfCatSold = 0;
        System.out.println("Static block executed — noOfCatSold initialized");
    }

    // ✅ Instance block — runs every time an object is created, before constructor
    {
        noOfCatSold++;
        System.out.println("Instance block executed — CodeBlock object created");
    }

    public static void main(String[] args) {
        CodeBlock myCar = new CodeBlock(3.0f);
        myCar.addFuel(7);
        myCar.drive();
        System.out.println("Current Fuel: " + myCar.getCurrFuel());
        System.out.println(CodeBlock.color); // Accessing static variable directly
        System.out.println("Max Speed: " + myCar.maxSpeed);

        CodeBlock myCar2 = new CodeBlock();
        myCar2.addFuel(5);
        myCar2.drive();
        System.out.println("Current Fuel of myCar2: " + myCar2.getCurrFuel());
        System.out.println(CodeBlock.color); // Accessing static variable directly

        // ✅ Print total number of CodeBlock objects created
        System.out.println("Total Cars Sold: " + CodeBlock.noOfCatSold);
    }

    // Parameterized constructor
    public CodeBlock(float maxspeed) {
        this.noOfWheels = 9;
        CodeBlock.color = "Black";
        this.maxSpeed = maxspeed;
        this.currentFuel = 6;
        this.noOfSeat = 2;
    }

    // Default constructor
    public CodeBlock() {
        this(3.0f); // Call the parameterized constructor
        this.noOfSeat = 2;
        this.currentFuel = 6;
        color = "Black";
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
