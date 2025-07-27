package JAVA_EXAM_COURSE.STQn;

public class BoxTest {

    // Box class definition
    static class Box {
        // Instance variables
        private int length;
        private int breadth;
        private int height;

        // 1. Default Constructor
        public Box() {
            this.length = 0;
            this.breadth = 0;
            this.height = 0;
        }

        // 2. Parameterized Constructor
        public Box(int length, int breadth, int height) {
            this.length = length;
            this.breadth = breadth;
            this.height = height;
        }

        // 3. Copy Constructor
        public Box(Box otherBox) {
            this.length = otherBox.length;
            this.breadth = otherBox.breadth;
            this.height = otherBox.height;
        }

        // Getter methods
        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }

        public int getHeight() {
            return height;
        }

        // Method to display box dimensions
        public void displayDimensions() {
            System.out.println("Length: " + length + ", Breadth: " + breadth + ", Height: " + height);
        }
    }

    // Main method to test the Box class
    public static void main(String[] args) {
        // Using default constructor
        Box defaultBox = new Box();
        System.out.print("Default Box Dimensions: ");
        defaultBox.displayDimensions();

        // Using parameterized constructor
        Box customBox = new Box(10, 5, 8);
        System.out.print("Custom Box Dimensions: ");
        customBox.displayDimensions();

        // Using copy constructor
        Box copiedBox = new Box(customBox);
        System.out.print("Copied Box Dimensions: ");
        copiedBox.displayDimensions();
    }
}
