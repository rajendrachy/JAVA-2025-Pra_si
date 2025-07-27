package JAVA_EXAM_COURSE.STQn;

import java.util.Arrays;

public class StudentTest {
    
    // Student class
    static class Student {
        // Private instance variables to store student data
        private String name;
        private int id;
        private int roomNo;
        private double hostelFees;
        private double foodFees;
        private String[] subjects;

        // Static variable shared among all instances
        private static int totalRoomsAssigned = 0;

        // Constructor to initialize a new Student object
        public Student(String name, int id, int roomNo, double hostelFees, double foodFees, String[] subjects) {
            this.name = name;
            this.id = id;
            this.roomNo = roomNo;
            this.hostelFees = hostelFees;
            this.foodFees = foodFees;
            this.subjects = subjects;
            totalRoomsAssigned++; // Increment static counter
        }

        // Static method to get total rooms assigned
        public static int getTotalRoomsAssigned() {
            return totalRoomsAssigned;
        }

        // Custom string representation
        @Override
        public String toString() {
            return "Student[" +
                   "Name = " + name +
                   ", ID = " + id +
                   ", Room No = " + roomNo +
                   ", Hostel Fees = " + hostelFees +
                   ", Food Fees = " + foodFees +
                   ", Subjects = " + Arrays.toString(subjects) +
                   "]";
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Sample subjects
        String[] subjects1 = {"Math", "Physics", "Chemistry"};
        String[] subjects2 = {"Biology", "English", "History"};

        // Create Student objects
        Student s1 = new Student("Alice", 101, 1, 15000.0, 5000.0, subjects1);
        Student s2 = new Student("Bob", 102, 2, 16000.0, 5200.0, subjects2);

        // Print Student details
        System.out.println(s1);
        System.out.println(s2);

        // Print total rooms assigned
        System.out.println("Total rooms assigned: " + Student.getTotalRoomsAssigned());
    }
}


