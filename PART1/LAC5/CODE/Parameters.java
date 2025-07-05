package PART1.LAC5.CODE;

public class Parameters {
  public static void main(String[] args) { // arguments with arrays
    int num = sum(11, 22); // arguments
    System.out.println(num);

  }
  
  public static int sum(int a, int b) { // parameters
    System.out.println("First no is : " + a);
    System.out.println("Second no is: " +b);
   int res = a + b;
   return res;
  }

}

