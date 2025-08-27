package STRING;
// 1. Make a new string using 2 given strings 

public class NewString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Method 1: Using + operator
        String result1 = str1 + " " + str2;

        // Method 2: Using concat()
        String result2 = str1.concat(" ").concat(str2);

        System.out.println("Using + : " + result1);
        System.out.println("Using concat : " + result2);
    }
}







