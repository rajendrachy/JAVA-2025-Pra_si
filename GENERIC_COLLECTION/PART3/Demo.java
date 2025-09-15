package PART3;
import java.util.*;

//Collection -> 1.2 & Generics -> 1.5
// Collection -> dynamic array


//two way to fetch value from a collection
// 1.iterator
// enhance for loop


public class Demo {
  public static void main(String[] args) {
    //  int values[] = new int[4];
    //  Object valuse1[] = new Object[4]; // There is anything put
    //  valuse1[0] = "rc";
    //  valuse1[1] = 7;



    Collection values = new ArrayList(); // we can add value of any type
    values.add(3);
    values.add("rc");
    values.add(5.8);
    values.remove(5.8);

//  Iterator i = values.iterator(); // This is a old method

//  while (i.hasNext()) {

//  System.out.println(i.next());
//  }   





//---Using a Enhance for loop-------

for(Object i : values) {
  System.out.println(i);
}

  }
}



// collection use sequencewise
