package COLLECTION;

import java.util.*;


public class qn4
{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter string: ");
	String word = sc.nextLine();
	
	System.out.println(word);
	
	LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();
	
	for(char c : word.toCharArray()) {
	    if(freq.containsKey(c)) {
	        freq.put(c, freq.get(c) + 1);
	    } else {
	        freq.put(c, 1);
	    }
	}
  



	
	for(Character c : freq.keySet()) {
	    System.out.println(c + ": " + freq.get(c));
	}
	}
}






//--------or--------

// import java.util.*;

// public class qn4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter string: ");
//         String word = sc.nextLine();

//         LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();

//         for (char c : word.toCharArray()) {
//             // increment frequency directly
//             freq.put(c, freq.getOrDefault(c, 0) + 1);
//         }

//         // Print frequencies
//         for (Character c : freq.keySet()) {
//             System.out.println(c + ": " + freq.get(c));
//         }
//     }
// }


