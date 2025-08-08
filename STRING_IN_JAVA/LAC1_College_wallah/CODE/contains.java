// package LAC1_College_wallah.CODE;
// //--------contains()--------------
// //Remember, java is case sensitive
// public class contains {
//   public static void main(String[] args) {
//     String str = "Rajendra Chaudhary";
//     System.out.println(str.contains("aaj")); // Gives the true and false Output // if we give and char inside contains it throw error


//   }
// }






package LAC1_College_wallah.CODE;
//--------startsWith() and endsWith()--------------
//Remember, java is case sensitive
public class contains {
  public static void main(String[] args) {
    String str = "Rajendra Chaudhary";
   System.out.println(str.startsWith("R")); // true
   System.out.println(str.startsWith("Ra")); // true

   System.out.println(str.endsWith("ry")); // 'ry' => error // output-> true
   System.out.println(str.endsWith("ac")); // false

  }
}
