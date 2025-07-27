package JAVA_EXAM_COURSE.STQn;

import java.util.Arrays;

// public class StudentTest {
    
//     // Student class
//     static class Student {
//         // Private instance variables to store student data
//         private String name;
//         private int id;
//         private int roomNo;
//         private double hostelFees;
//         private double foodFees;
//         private String[] subjects;

//         // Static variable shared among all instances
//         private static int totalRoomsAssigned = 0;

//         // Constructor to initialize a new Student object
//         public Student(String name, int id, int roomNo, double hostelFees, double foodFees, String[] subjects) {
//             this.name = name;
//             this.id = id;
//             this.roomNo = roomNo;
//             this.hostelFees = hostelFees;
//             this.foodFees = foodFees;
//             this.subjects = subjects;
//             totalRoomsAssigned++; // Increment static counter
//         }

//         // Static method to get total rooms assigned
//         public static int getTotalRoomsAssigned() {
//             return totalRoomsAssigned;
//         }

//         // Custom string representation
//         @Override
//         public String toString() {
//             return "Student[" + "Name = " + name + ", ID = " + id + ", Room No = " + roomNo + ", Hostel Fees = " + hostelFees + ", Food Fees = " + foodFees +", Subjects = " + Arrays.toString(subjects) +
//                    "]";
//         }
//     }


//     // Main method to run the program
//     public static void main(String[] args) {
//         // Sample subjects
//         String[] subjects1 = {"Math", "Physics", "Chemistry"};
//         String[] subjects2 = {"Biology", "English", "History"};

//         // Create Student objects
//         Student s1 = new Student("Alice", 101, 1, 15000.0, 5000.0, subjects1);
//         Student s2 = new Student("Bob", 102, 2, 16000.0, 5200.0, subjects2);

//         // Print Student details
//         System.out.println(s1);
//         System.out.println(s2);

//         // Print total rooms assigned
//         System.out.println("Total rooms assigned: " + Student.getTotalRoomsAssigned());
//     }
// }












public class StudentTest{


    static int tRoom = 0;

    String name;
    int id;
    int roomNo;
    double hFee;
    double fFee;
    String[] sub;

StudentTest(String name, int id, int roomNo, double hFee, double fFee, String[] sub) {
    this.name = name;
    this.id = id;
    this.roomNo = roomNo;
    this.hFee = hFee;
    this.fFee = fFee;
    this.sub = sub;
    tRoom++;

}

  StudentTest(String name, int id, int roomNo, double fFee, String[] sub) {
    this(name, id, roomNo, 4.0, fFee, sub); // default hostelfee
}



public static int getTotalRoomCnt() {
    return tRoom;
}



public String toString() {
     return "Student[name=" + name + ", id=" + id + ", roomNo=" + roomNo + ", hostelFee=" + hFee + ", Foodfee= " + fFee + ", subject=" + Arrays.toString(sub) + "]";
}


    public static void main(String[] args) {
        String[] sub1 = {"math", "Nepali", "english"};
     
        StudentTest s1 = new StudentTest("rajendra", 123, 23, 400.0, sub1);
                StudentTest s2 = new StudentTest("rajendra", 123, 23, 500.0, 400.0, sub1);

        System.out.println(s1);
     System.out.println(s2);



        System.out.println("Total room assign: " + StudentTest.getTotalRoomCnt());
    }
}



