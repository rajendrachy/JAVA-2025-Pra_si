package PART1.LAC4.CODE;

public class UnaryExample {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(+a);   // Unary plus (no effect): 5
        System.out.println(-a);   // Unary minus: -5
        System.out.println(++a);  // Pre-increment: 6
        System.out.println(a--);  // Post-decrement: prints 6, then a becomes 5
        System.out.println(!true); // Logical NOT: false



        int x = 5;
        int y = -x;
        int z = -y;

        System.out.println(z);

    }
}

