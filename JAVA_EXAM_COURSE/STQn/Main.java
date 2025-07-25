package JAVA_EXAM_COURSE.STQn;

import PART1.LAC5.CODE.returnFUn;

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
// class MyClass {
//     // Static variable to keep track of number of objects created
//     static int objectCount = 0;

//     // Constructor
//     MyClass() {
//         objectCount++;
//         System.out.println("Object created. Total objects: " + objectCount);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Creating objects of MyClass
//         MyClass obj1 = new MyClass();
//         MyClass obj2 = new MyClass();
//         MyClass obj3 = new MyClass();
//     }
// }












class MyClass {
  static int objCnt = 0;


  MyClass() {
    objCnt++;
    // System.out.println(objCnt);
  }

    static int objCntVal() {
      return objCnt++;
    }

}

class Main{
  public static void main(String[] args) {
        MyClass obj = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        MyClass obj4 = new MyClass();

        System.out.println(MyClass.objCntVal());
  }
}




