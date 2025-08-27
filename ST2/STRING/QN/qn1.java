package STRING.QN;
import java.util.*;

public class qn1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    int cnt = 0;
    str = str.toLowerCase();

    for(int i=0; i<str.length(); i++) {
      char ch = str.charAt(i);

      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
        cnt++;
      }
    }

    System.out.println("The total vowels letter are: " + cnt);
  
  }
}




