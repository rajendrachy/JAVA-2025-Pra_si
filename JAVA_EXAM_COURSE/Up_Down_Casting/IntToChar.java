public class IntToChar {

  public static void main(String[] args) {
    int x = 97;
    // int 32 bit -> 4 byte -> 4*8 => 32 bits
    // char 16 bit -> 2 byte -> 2 * 8 -> 16 bits => 1byte -> 16 bits

    char y = (char) x; // A -> 65 and a = 97
    

    System.out.println(y); // a
  }
}