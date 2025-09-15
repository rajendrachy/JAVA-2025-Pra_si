package PART5;
import java.util.*;

//---------Vector-----------
//-> Vector is collection of list. it is always same as arraylist.it is dynamic we can increase a size of array or vactor


public class Demo {
  public static void main(String[] args) {

    // ArrayList<Integer> v = new ArrayList<>(); // increase the capacity 50% // not hreadsafe // fast

    Vector<Integer> v = new Vector<>(); // increase the capacity 100% // Threadseaf // slow
    v.add(4);
    v.add(22);
    v.add(90);
    v.add(9);
    v.remove(0); // index
    System.out.println(v.capacity()); // bydefault capaticy => 10


    for(int i : v) {
      System.out.println(i);
    }


  }
}
