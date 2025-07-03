//---------------Bitwise and(&) -----------------------
// public class Challange {
//   public static void main(String [] args) {


//     int a = 13;
//     int b = 3;
//     int res = a & b;

//     System.out.println("The result is : " + res);
//   }
// }


















//-----------Bitwise or(|)----------------

// public class Challange {
//   public static void main(String [] args) {


//     int a = 13;
//     int b = 3;
//     int res = a | b;

//     System.out.println("The result is : " + res);
//   }
// }
















//-----------Bitwise Xor(^)----------------
// public class Challange {
//   public static void main(String [] args) {


//     int a = 10;
//     int b = 14;
//     int res = a ^ b;

//     System.out.println("The result is : " + res);
//   }
// }
















//-----------Bitwise not(~) or complement----------------
// public class Challange {
//   public static void main(String [] args) {


//     int a = 11;
//     int res = ~a;

//       System.out.println("The result is : " + res);

//   }
// }


























// 🔹 Left Shift (<<) Shortcut Formula

// a << n  ≡  a × (2ⁿ)
// ✅ Left shift multiplies the number by 2 raised to the power of n.

// Example:
// 5 << 3  ≡  5 × (2³) = 5 × 8 = 40
// 🔹 Right Shift (>>) Shortcut Formula

// a >> n  ≡  a ÷ (2ⁿ)   (integer division, discards remainder)
// ✅ Right shift divides the number by 2 raised to the power of n.

// Example:
// 40 >> 3  ≡  40 ÷ (2³) = 40 ÷ 8 = 5
















// public class Challange {
//     public static void main(String[] args) {
//         int a = 5;
//         int n = 2;

//         // Left Shift
//         int leftShift = a << n; // a * (2^n)
//         int leftFormula = a * (int)Math.pow(2, n);

//         System.out.println("Left Shift: " + a + " << " + n + " = " + leftShift);
//         System.out.println("Left Formula: " + a + " * 2^" + n + " = " + leftFormula);

//         int b = 40;

//         // Right Shift
//         int rightShift = b >> n; // b / (2^n)
//         int rightFormula = b / (int)Math.pow(2, n);

//         System.out.println("Right Shift: " + b + " >> " + n + " = " + rightShift);
//         System.out.println("Right Formula: " + b + " / 2^" + n + " = " + rightFormula);
//     }
// }









//-----------qn27------------------even or odd using bitwise-------------------------

//0 =>  0000 -> righ-most bit = 0 so, it is even
//1 => 0001 -> righ-most bit = 1 so, it is odd

// solve using bitise & operator---------------


//-----------qn27------------------even or odd using bitwise-------------------------
import java.util.Scanner;

public class Challange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if ((number & 1) == 0) {
            System.out.println(number + " is Even (Checked using bitwise operator)");
        } else {
            System.out.println(number + " is Odd (Checked using bitwise operator)");
        }
        
        scanner.close();
    }
}

