// package BITWISE_OPERATOR;

// public class Test {
//   public static void main(String[] args) {
//     // computers -> 0 or 1
//     int a = 5;
//     System.out.println(Integer.toBinaryString(a)); // 101

//     // 00000000 00000000 00000000 00000101 -> 32 bits



//   }
// }



//System.out.println(Integer.toBinaryString(a)); // 101 // Integer to binary change







package BITWISE_OPERATOR;

public class Test {
  public static void main(String[] args) {
    //operands --> byte, short, int , long


    // and operator &
    int c = 5 & 4;
    System.out.println(c);


    // or operator |
    int a = 5 | 7;
    System.out.println(a);



    // xor operator ^

    int b = 5 ^ 7; // xor -> same => 0 and different -> 1
    System.out.println(b);



    //not operator ~
  int d = 5;
  System.out.println(Integer.toBinaryString(d));
  int e = ~d;
  System.out.println(e);
  System.out.println(Integer.toBinaryString(e));

//  👉 Trick to remember:
// ~x = -(x + 1)
// So ~5 = -(5 + 1) = -6



    // left shift <<
    int f = 5;
    int g = f << 1;
    System.out.println(g);
//      Formula
//     x << n = x * (2^n)
//   x = number
// n = number of left shifts
    




    // right shift >>  // +ve -> 0 fill and -ve -> 1 fill
    int h = 5;
    int i = h >> 1;
    System.out.println(i);

  //   Formula for Right Shift (>>)
  //  x >> n = x / 2^n
// x = number
// n = number of bits shifted
// >> keeps the sign bit (arithmetic shift).







  //  unsigned right shift >>> // it fill with 0
//   1. What is >>> ?
// >>> = unsigned right shift (a.k.a. logical shift right).
// It shifts bits to the right and fills with 0 from the left (ignores the sign bit).
// Always gives a non-negative result.


// formula
// x >>> n = x mod 2^32 / 2^n
int x = 20;
int y = x >>> 2;
System.out.println(y);


  }
}


