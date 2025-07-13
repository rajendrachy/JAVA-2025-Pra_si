package PART2.LOOPS;

public class BreakAndCon {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      
      // Skip numbers divisible by 5 using continue
      // if (i % 5 == 0) {
      //   continue;
      // }

      // Stop the loop when the number reaches 90
      if (i == 90) {
        break;
      }

      System.out.println(i);
    }
  }
}



//---------------------Explanation:--------------------------
// continue: Skips printing numbers divisible by 5.
// break: Stops the loop completely when i == 90.



