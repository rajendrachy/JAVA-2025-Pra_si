package COllection_Hashmap;

import java.util.*;

public class CommonStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        sc.nextLine();
        ArrayList<String> courseA = new ArrayList<>();
        for (int i = 0; i < n1; i++) courseA.add(sc.nextLine());

        int n2 = sc.nextInt();
        sc.nextLine();
        ArrayList<String> courseB = new ArrayList<>();
        for (int i = 0; i < n2; i++) courseB.add(sc.nextLine());

        ArrayList<String> common = new ArrayList<>();
        for (String student : courseA) {
            if (courseB.contains(student)) {
                common.add(student);
            }
        }

        for (String student : common) {
            System.out.println(student);
        }
    }
}
