package STRING.QN;
import java.util.*;

public class qn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // 1. Split sentence into words
        String[] words = sentence.split(" ");

        // // 2. Print words line by line
        System.out.println("Words after splitting:");
        for(String word : words) {
            System.out.println(word);
        }



        // 3. Join words with hyphen
        String joined = String.join("_", words);
        System.out.println("Sentence after joining with hyphens: " + joined);
    }
}






