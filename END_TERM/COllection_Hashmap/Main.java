package COllection_Hashmap;
//Question 2: Playlist Order Verification
import java.util.*;

public class Main {
    
    public static int countPlaylistMismatch(String[] songs, double[] durations, String[] djSongs, double[] djDurations) {
        int n = songs.length;
        int m = djSongs.length;
        int cnt = 0;

        // ---- Step 1: check order mismatch ----
        boolean orderMismatch = false;

        int size = Math.min(n, m);

        for (int i = 0; i < size; i++) {
            if (!songs[i].equals(djSongs[i])) {
                orderMismatch = true;
                break;
            }
        }


        if (orderMismatch) cnt++;


        // ---- Step 2: check duration mismatch ----
        for (int i = 0; i < size; i++) {
            if (songs[i].equals(djSongs[i]) && durations[i] != djDurations[i]) {
                cnt++;
            }
        }



        // ---- Step 3: if playlist lengths differ ----
        if (n != m) cnt++;

        return cnt;
    }
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] songs = new String[n];
        for (int i = 0; i < n; i++) {
            songs[i] = sc.nextLine();
        }
        
        double[] durations = new double[n];
        for (int i = 0; i < n; i++) {
            durations[i] = sc.nextDouble();
        }
        sc.nextLine();
        
        int m = sc.nextInt();
        sc.nextLine();
        
        String[] djSongs = new String[m];
        for (int i = 0; i < m; i++) {
            djSongs[i] = sc.nextLine();
        }
        
        double[] djDurations = new double[m];
        for (int i = 0; i < m; i++) {
            djDurations[i] = sc.nextDouble();
        }
        
        int res = countPlaylistMismatch(songs, durations, djSongs, djDurations);
        System.out.println(res);
    }
}
