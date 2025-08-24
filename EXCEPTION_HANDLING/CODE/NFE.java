//-------NumberFormateException--------

public class NFE {
  public static void main(String[] args) {
    String str = "ankit";


    try {
    int a = Integer.parseInt(str);
    System.out.println(a);

    System.out.println("String NumberFormateException "); 
    } catch(Exception e) {
      System.out.println("String " + str + "not converted");
    }

    System.out.println("Main method ended");

  }
}





