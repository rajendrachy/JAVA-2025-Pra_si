package PART4;
import java.util.*;


public class Demo {
  public static void main(String[] args) {
  
    List<Integer> values = new ArrayList<>(); // we can add value of any type
    values.add(3);
    values.add(24);
    values.add(2);
 values.add(1,9);

//---Using a Enhance for loop-------

Collections.sort(values);


// for(int i : values) {
//   System.out.println(i);
// }



// also
values.forEach(System.out::println);
  }
}
