import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cut_Ribbon {
	
//	private static List<Integer> list;
	
	private static int[] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		dp = new int[n+1];
//		list = new ArrayList<>();
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();		
//		System.out.println(solve(n, a, b, c, dp));
		System.out.println(solve(n, a, b, c));

	}
	
	private static int solve(int n, int a, int b, int c) {
		
		// we can form a equation from given question
		// x*a + y*b + z*c = n
		
		//from above we can get 
						// z = (n - x*a - y*b) / c;
		
		int value = 0;
		
		// trial and error for every x and y values
		for(int x = 0; x * a <= n; x++) {
			for(int y = 0; y * b <= n - x*a; y++) {
				int temp = n - x*a - y*b, z = 0;
				
				if(temp >= 0 && temp % c == 0) {
					z = temp / c;	
				}else	continue;
				
				value = Math.max(value, x + y + z);
			}
		}
		
		return value;
	}
	
	
	//bottom up (or) memoized solution
	
	private static int solve(int n, int a, int b, int c, int[] dp) {
		
		if(n == 0)
			return 0;
		if(n < 0)	return Integer.MIN_VALUE;
		
		if(dp[n] != 0)
			return dp[n];
		
		return dp[n] = 1 + Math.max(solve(n-a, a, b, c, dp), Math.max(solve(n-b, a, b, c, dp), solve(n-c, a, b, c, dp)));
	}

}
