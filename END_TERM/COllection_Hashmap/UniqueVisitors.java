package COllection_Hashmap;

import java.util.*;

public class UniqueVisitors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> visitors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            visitors.add(sc.nextLine());
        }

        ArrayList<String> uniqueVisitors = new ArrayList<>();
        for (String visitor : visitors) {
            if (!uniqueVisitors.contains(visitor)) {
                uniqueVisitors.add(visitor);
            }
        }

        System.out.println(uniqueVisitors.size());
    }
}



