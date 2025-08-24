//--Arithmatic exception error-----
// class Test {
//   public static void main(String[] args) {
//     System.out.println("Main method started");;

//     int a = 10, b=0, c;

//     c = a / b;
//     System.out.println(c);

//     System.out.println("Main method ended");
//   }
// }









class Test {
  public static void main(String[] args) {
    System.out.println("Main method started");;

    int a = 10, b=0, c;

    try {
    c = a / b;
    System.out.println(c);

    }
    catch (Exception e) {
        // System.out.println(e); // exception occure in the Run time
        System.out.println("Cannot divide by 0");
    }

    System.out.println("Main method ended");
  }
}






