// @FunctionalInterface
// interface A {
//   void show();

// }




// public class Demo {
//   public static void main(String[] args) {
//     A obj = new A() {
//       public void show() {
//         System.out.println("in show");
//       }
//     };
//     obj.show();
//   }
// }









//-------Lamda expression-------------
// @FunctionalInterface
// interface A {
//   void show();

// }




// public class Demo {
//   public static void main(String[] args) {
//     A obj = () ->  
//     {
//       System.out.println("in show");
//     };
  
//     obj.show();
//   }
// }

















//----------passing parameters in the lamda expression--------
@FunctionalInterface
interface A {
  void show(int i);

}




public class Demo {
  public static void main(String[] args) {
    A obj = (i) ->  
    {
      System.out.println("in show : " + i);
    };
  
    obj.show(5);
  }
}




