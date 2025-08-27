package STRING.QN;
import java.util.*;

public class qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // 1. Check if the sentence contains the word "java"
        if (sentence.contains("java")) {
            System.out.println("The sentence contains the word 'java'.");
        } else {
            System.out.println("The sentence does not contain the word 'java'.");
        }

        // 2. Check if the sentence starts with "Hello"
        if (sentence.startsWith("Hello")) {
            System.out.println("The sentence starts with 'Hello'.");
        } else {
            System.out.println("The sentence does not start with 'Hello'.");
        }

        // 3. Check if the sentence ends with "world"
        if (sentence.endsWith("world")) {
            System.out.println("The sentence ends with 'world'.");
        } else {
            System.out.println("The sentence does not end with 'world'.");
        }

        // 4. Find the first index of character 'a'
        int firstIndex = sentence.indexOf('a');
        if (firstIndex != -1) {
            System.out.println("The first index of 'a' is: " + firstIndex);
        } else {
            System.out.println("The character 'a' is not found in the sentence.");
        }

        // 5. Find the last index of character 'a'
        int lastIndex = sentence.lastIndexOf('a');
        if (lastIndex != -1) {
            System.out.println("The last index of 'a' is: " + lastIndex);
        } else {
            System.out.println("The character 'a' is not found in the sentence.");
        }
    }
}
