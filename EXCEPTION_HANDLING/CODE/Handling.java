public class Handling {
  public static void main(String[] args) {
    
    try {
   System.out.println("Learn coding");
   int a = 20, b=0, c; // if b=2 try this also
   c = a/b;
   System.out.println(c);

   System.out.println("like share");
    } catch(ArithmeticException a) {
   System.out.println("cannot divide by 0");
    } 
    finally {
      System.out.println("sunscribe"); // finally block alway run
    }

    System.out.println("Mian method ended");
  }
}
