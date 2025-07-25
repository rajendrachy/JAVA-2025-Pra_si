package JAVA_EXAM_COURSE.CALL;

class Person {
    String name;
}

public class Test {
    public static void update(Person p) {
        p.name = "Alice";
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bob";

        update(p1);
        System.out.println(p1.name); // Alice
    }
}


