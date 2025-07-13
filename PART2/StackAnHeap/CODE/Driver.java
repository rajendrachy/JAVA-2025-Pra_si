package PART2.StackAnHeap.CODE;
//-----------Finalize-----------------------
// ⚠️ Reminder: finalize() is deprecated since Java 9 and is not reliable. This code is for educational purposes only.



// // -----------Driver Object-------------------

// -----------Driver Class-------------------
public class Driver {

    public static void main(String[] args) {

        // Creating a Car object
        Car swift = new Car();
        swift.addFuel(6);
        swift.start();
        swift.drive();

        // Make the Car object eligible for Garbage Collection
        swift = null;

        // Suggest Garbage Collector to run
        System.gc();

        // Optional: Give GC a moment to finalize
        try {
            Thread.sleep(1000); // 1 second pause
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method completed");
    }
}

// --------Car Class-------------
class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuel;
    int noOfSeat;

    public void start() {
        if (currentFuel <= 0) {
            System.out.println("Car is out of fuel, cannot start");
            return;
        } else if (currentFuel < 5) {
            System.out.println("Car is in reserved mode");
        }

        System.out.println("Car is starting, bruhhhhhh");
    }

    public void drive() {
        if (currentFuel <= 0) {
            System.out.println("Cannot drive — out of fuel!");
            return;
        }

        currentFuel--;
        System.out.println("Car is driving. Fuel left: " + currentFuel);
    }

    public void addFuel(float fuel) {
        currentFuel += fuel;
        System.out.println("Added fuel: " + fuel + " | Current fuel: " + currentFuel);
    }

    public float getCurrFuel() {
        return currentFuel;
    }

    // This method may be called by Garbage Collector before object is destroyed
    @Override
    protected void finalize() throws Throwable {
        System.out.println(" finalize() called — Car object is being cleaned up");
    }
}
