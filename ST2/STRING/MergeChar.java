package STRING;

public class MergeChar {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "coding";

        StringBuilder result = new StringBuilder();

        int i = 0, j = 0;
        int block = 2; // number of chars to take from each string

        while (i < str1.length() || j < str2.length()) {
            // take 2 chars from str1
            for (int k = 0; k < block && i < str1.length(); k++) {
                result.append(str1.charAt(i++));
            }

            // take 2 chars from str2
            for (int k = 0; k < block && j < str2.length(); k++) {
                result.append(str2.charAt(j++));
            }
        }

        System.out.println("Merged String = " + result.toString());
    }
}



