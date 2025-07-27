// 2. EmployeeRecord System 
// Write a class named EmployeeRecord that stores an employee’s details and keeps track of 
// the total number of employees created. 
// Include the following members: 
// Constructors: 
// EmployeeRecord(String name, int age, String department) 
// EmployeeRecord(String name, int age) 
// Creates an employee with "General" as the default department. 
// Methods: 
// String getDepartment() 
// Returns the department of the employee. 
// public String toString() 
// Returns a string in the format: 
// "EmployeeRecord{name='John', age=30, department='IT'}" 
// static int getEmployeeCount()  
// Returns the total number of employee records created.


package JAVA_EXAM_COURSE.STQn;


// public class EmployeeRecord {
//     private static int empCnt = 0; // Static counter for all employee records

//     private String name;
//     private int age;
//     private String department;

//     // Constructor with name, age, department
//     public EmployeeRecord(String name, int age, String department) {
//         this.name = name;
//         this.age = age;
//         this.department = department;
//         empCnt++;
//     }

//     // Constructor with default department "General"
//     public EmployeeRecord(String name, int age) {
//         this(name, age, "General");
//     }


//     // Getter for department
//     public String getDepartment() {
//         return department;
//     }

//     // toString method
//     @Override
//     public String toString() {
//         return "EmployeeRecord{name='" + name + "', age=" + age + ", department='" + department + "'}";
//     }

//     // Static method to get total employee count
//     public static int getEmployeeCount() {
//         return empCnt;
//     }

//     // Main method for testing
//     public static void main(String[] args) {
//         EmployeeRecord e1 = new EmployeeRecord("John", 30, "IT");
//         EmployeeRecord e2 = new EmployeeRecord("Alice", 25);
//         EmployeeRecord e3 = new EmployeeRecord("Bob", 40, "HR");

//         System.out.println(e1);
//         System.out.println(e2);
//         System.out.println(e3);
//         System.out.println("Total Employees: " + EmployeeRecord.getEmployeeCount());
//     }
// }





public class EmployeeRecord  {

    static int empCnt = 0;

    String name;
    int age;
    String department;

    EmployeeRecord(String name, int age, String department) {
          this.name = name;
          this.age = age;
          this.department = department;
          empCnt++;
    }


    EmployeeRecord(String name, int age) {
         this(name, age, "General");
    }


    String getDepartment(){
        return department;
    }



    //  return "EmployeeRecord{name='" + name + "', age=" + age + ", department='" + department + "'}";

    public String toString() {
        return "EmployRecord{name='" + name + "', age=" + age + ",department='" + department + "'}";
    }


    static int getEmpCnt() {
        return empCnt;
    }



    public static void main(String[] args) {
        EmployeeRecord e1 = new EmployeeRecord("Raj", 20, "it");
        EmployeeRecord e2 = new EmployeeRecord("Ram", 50, "buss");

        System.out.println(e1);
        System.out.println(e2);


        System.out.println(EmployeeRecord.getEmpCnt());


    }
}

