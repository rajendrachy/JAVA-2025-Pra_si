package PART2.RandomMathCls.CODE;

public class StringComparisonDemo {
    public static void main(String[] args) {
        
        // -------------------------------
        // Using String (Immutable)
        String str = "Hello";
        str = str + " World";
        System.out.println("String: " + str);

        // -------------------------------
        // Using StringBuilder (Mutable, Not Thread-safe)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb.toString());

        // -------------------------------
        // Using StringBuffer (Mutable, Thread-safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf.toString());
    }
}

