public class qn2 {

    // Generic method to check equality
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(10, 10));        // true
        System.out.println(isEqual("Java", "C++")); // false
    }
}
