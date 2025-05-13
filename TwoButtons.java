import java.util.Scanner;

public class TwoButtons {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt(), ans = 0;
		
//		System.out.println(n + " " + m);
		
		while(m != n) {
			 
			if(m > n && m % 2 == 0) m /= 2;
			else	m += 1;
			ans += 1;
			
		}
		
		System.out.println(ans);


	}

}

/*
 	
	private static Map<Integer, Integer> memo = new HashMap<>();

	

	
	private static int dfs(int n, int m) {
		if (n >= m) {
			return n - m;
		}
		if(n < m / 2)
			return Integer.MAX_VALUE;
		if (memo.containsKey(n)) return memo.get(n);

		int result = 1 + Math.min(dfs(n * 2, m), dfs(n - 1, m));
		memo.put(n, result);
		return result;
	}
	
	//stackoverflow ? 


*/
