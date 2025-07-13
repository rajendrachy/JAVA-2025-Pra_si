// package PART2.LOOPS;

// public class Foreach {
//   public static void main(String[] args) {
    
//     String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

//     // Using foreach loop to iterate through the array
//     for (String fruit : fruits) {
//       System.out.println(fruit);
//     }
    

//   }
// }














//--------------another-------------
package PART2.LOOPS;

public class Foreach {
  public static void main(String[] args) {
    
   String[] array = new String [] {
      "Apple", "Banana", "Cherry", "Date", "Rajendra"
    };

    printArray(array);

  }

    // Method to print the elements of the array
    public static void printArray(String[] arr) {
      for (String element : arr) {
        System.out.println(element);
      }
    }
}




