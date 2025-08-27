package STRING;

public class newStr {
    public static void main(String[] args) {
        String str1 = "java programming language";
        String str2 = "coding with CodeQuotient";

        String[] w1 = str1.split(" ");
        String[] w2 = str2.split(" ");


        String newStr = "";
        
        for(int i=0; i<w1.length; i++) {
            newStr += w1[i] + " " + w2[i] + " ";
        }

        System.out.println("New String = " + newStr.trim());

       

    }
}










