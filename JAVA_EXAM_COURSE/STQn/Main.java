package JAVA_EXAM_COURSE.STQn;

// class MyClass {
//     static int objectCount = 0;

//     // Constructor
//     MyClass() {
//         objectCount++;
//     }

//     static int getObjectCount() {
//         return objectCount;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         MyClass obj1 = new MyClass();
//         MyClass obj2 = new MyClass();
//         MyClass obj3 = new MyClass();

//         System.out.println("Total objects created: " + MyClass.getObjectCount());
//     }
// }





//-----------another way-------------
class MyClass {
    // Static variable to keep track of number of objects created
    static int objectCount = 0;

    // Constructor
    MyClass() {
        objectCount++;
        System.out.println("Object created. Total objects: " + objectCount);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
    }
}



