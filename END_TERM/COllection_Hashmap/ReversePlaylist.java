package COllection_Hashmap;

import java.util.*;

public class ReversePlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> playlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            playlist.add(sc.nextLine());
        }

        // Reverse using two-pointer swap
        int i = 0, j = playlist.size() - 1;
        while (i < j) {
            String temp = playlist.get(i);
            playlist.set(i, playlist.get(j));
            playlist.set(j, temp);
            i++;
            j--;
        }

        for (String song : playlist) {
            System.out.println(song);
        }
    }
}



