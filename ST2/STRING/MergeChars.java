package STRING;

public class MergeChars {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "code";

        StringBuilder result = new StringBuilder();

        int maxLen = Math.max(str1.length(), str2.length());

        for (int i = 0; i < maxLen; i++) {
            if (i < str1.length()) {
                result.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                result.append(str2.charAt(i));
            }
        }

        System.out.println("Merged String = " + result.toString());
    }
}




