package STRING;
// 3. Make a new string by taking just next character e.g. str1 = java
   //New string= kbwb ( next character of 'j' is 'k')

   
class making {
    public static void main(String[] args) {
        String str1 = "java";
        String newStr = "";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);     // take each character
            ch = (char)(ch + 1);          // move to next character
            newStr += ch;                 // add to new string
        }

        System.out.println("New String = " + newStr);
    }
}






