package PART2.RandomMathCls.CODE;
//--------------string format----------------
public class StringFormat {
  public static void main(String[] args) {
    String name = "John";
    int marks = 45;

    System.out.println("Hello" + name + ", your marks are " + marks);

    System.out.printf("Hello %s, your marks are : %d", name, marks); // name -> small letter
System.out.println();

    
 System.out.printf("Hello %S, your marks are : %d", name, marks); // name-> capital letter
 


  }
}
