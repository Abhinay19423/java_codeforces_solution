import java.util.Arrays;
import java.util.Scanner;


public class BerSU_Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] boys = new int[n];
		for(int i = 0; i < n; i++)
			boys[i] = sc.nextInt();
		Arrays.sort(boys);
		int m = sc.nextInt();
		int[] girls = new int[m];
		for(int i = 0; i< m; i++)
			girls[i] = sc.nextInt();
		
		Arrays.sort(girls);
		int ans = 0;
		
		/*
		 	ex : boys = 1 2 4 6
		 		 girls = 1 5 5 7 9
		 		 
		 	sol : i = 0, j = 0  => 1 - 1 = 0 , boys = 1 2 4 6
		 									   girls = 99999 5 5 7 9
				  i = 3, j = 2  => 1 - 1 = 0 , boys = 1 2 4 6
		 									   girls = 99999 99999 5 7 9
		 		  i = 4, j = 3  => 1 - 1 = 0 , boys = 1 2 4 6
		 									   girls = 99999 99999 99999 7 9							   
		  
		 */
		
		for(int i = 0; i< n; i++) {
			for(int j = 0; j< m; j++) {
				if(Math.abs(boys[i] - girls[j]) <= 1) {
					girls[j] = Integer.MAX_VALUE;
					ans += 1;
					break;
				}
			}
		}
			
		
		System.out.println(ans);
	}

}
