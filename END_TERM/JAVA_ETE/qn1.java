package JAVA_ETE;

import java.util.*;

public class qn1 {
	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	 int n = sc.nextInt();
	 sc.nextLine();
	 
	 int[] arr = new int[n];
	 
	 for(int i=0; i<n; i++) {
	     arr[i] = sc.nextInt();
	     
	 }
	 
	 
	 
		int sum = 0;
		int total = n * (n+1)/2;
		
		for(int i=0; i<n; i++) {
		    sum += arr[i];
		}
		
		int ans = sum - total;
		
		System.out.println(ans);
	}
}

