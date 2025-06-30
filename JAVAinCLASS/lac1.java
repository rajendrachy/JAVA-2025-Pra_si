import java.util.Scanner;

public class lac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Input a float
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();

        // Input a single word (string)
        System.out.print("Enter a single word: ");
        String word = scanner.next();

        // Clear the newline left in the buffer
        // scanner.nextLine();

        // Input a full sentence
        System.out.print("Enter a full sentence: ");
        String sentence = scanner.nextLine();


        // Display the inputs
        System.out.println("\n--- You Entered ---");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);

        scanner.close(); // closes the Scanner object, which means it releases the underlying input stream resources associated with it — typically, System.in (the keyboard input).


    }
}



//-----------Run---------------------
// Enter an integer: 1
// Enter a float: 1.2
// Enter a single word: sdjnb dkfn
// Enter a full sentence: 
// --- You Entered ---
// Integer: 1
// Float: 1.2
// Word: sdjnb
// Sentence:  dkfn

// --------------------to prevent this use -> 
// Clear the newline left in the buffer
// scanner.nextLine();


