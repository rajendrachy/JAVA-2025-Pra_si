// File: Main.java

interface Printer {
    void start();  // Represents starting a printer
}

interface Engine {
    void start();  // Represents starting an engine
}



// Class that implements both interfaces
class Machine implements Printer, Engine {
    @Override
    public void start() {
        System.out.println("Machine starting: Printer ON, Engine ON");
    }

    // Optionally, you can add specific methods for each role
    public void printDocument() {
        System.out.println("Printing document...");
    }

    public void runEngine() {
        System.out.println("Engine is running...");
    }
}




public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();

        // Using as a Printer
        Printer printer = machine;
        printer.start();  // Calls Machine's start

        // Using as an Engine
        Engine engine = machine;
        engine.start();  // Also calls Machine's start

        // Additional functionality
        machine.start(); // Also calls Machine's start
        machine.printDocument();
        machine.runEngine();
    }
}





