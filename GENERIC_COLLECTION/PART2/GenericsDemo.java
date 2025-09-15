// import java.util.List;   
// import java.util.*;

// class GenericsDemo {
//   public static void main(String[] args) {
//     // int val = 5;

//     List <Integer> values = new ArrayList<Integer>();
//      values.add(7);
//   }
// }

// <> -> Achive typesafety















import java.util.*;


class Container<T extends Number> { // T represent type
  T value;

  public void show () {
    System.out.println(value.getClass().getName());
  }

}


class GenericsDemo {
  public static void main(String[] args) {
    // int val = 5;

   Container<Integer> obj = new Container<>();
   obj.value = 9;
  obj.show(); // java.lang.Integer

  }
}
