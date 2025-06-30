import java.util.Scanner;

public class lac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a single word
        System.out.print("Enter a single word: ");
        String word = scanner.next();  // reads only one word (no spaces)

        // Clear the input buffer (to remove newline left by next())
        // scanner.nextLine();

        // Input a full sentence
        System.out.print("Enter a full sentence: ");
        String sentence = scanner.nextLine();  // reads entire line (including spaces)

        // Output the inputs
        System.out.println("\n--- Output ---");
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);

        scanner.close();
    }
}







//------run---------
// Enter a single word: knj
// Enter a full sentence: 
// --- Output ---
// Word: knj
// Sentence: 
//-----------to prevent
//use ->
// Clear the input buffer (to remove newline left by next())
// scanner.nextLine();
