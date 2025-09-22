
import java.util.HashMap;
// frequency counting
public class Main {
    public static void main(String[] args) {
        String str = "programming";

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (freqMap.containsKey(ch)) {
                int oldValue = freqMap.get(ch);
                freqMap.put(ch, oldValue + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        for (Character key : freqMap.keySet()) {
            System.out.println(key + " => " + freqMap.get(key));
          }
        }
}





