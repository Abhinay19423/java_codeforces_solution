import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), max = Integer.MIN_VALUE;
		int[] shops = new int[n];
		for(int i = 0; i< n; i++) {
			shops[i] = sc.nextInt();
			max = max < shops[i]? shops[i] : max;
		}
		
		Arrays.sort(shops);
			
		int q = sc.nextInt();
		String s = "";
		while(q-- > 0) {
			int m = sc.nextInt();
			System.out.println(binSerach(shops, m, 0, n-1));
		}
//		System.out.print(s.substring(0, s.length() -1));
	}

	private static int binSerach(int[] shops, int m, int low, int high) {
		// TODO Auto-generated method stub
		
		if(low < 0)	return 0;
		
		if(shops[low] > m)	return 0;
		
		if(shops[high] <= m )	return high - low + 1;
		
		int mid = (low + high) / 2;
		if(shops[mid] <= m) 
			return mid - low + 1 + binSerach(shops, m, mid + 1, high);
		else
			return binSerach(shops, m, low, mid - 1);
	}

}

/* 
   int[] dp = new int[100000];
		for(int val : shops){
			dp[val] = 1;
		}
		
		for(int i = 1; i< 100000; i++) {
			if(dp[i] != 0)
				dp[i] = Math.max(dp[i], 1 + dp[i-1]);
			else
				dp[i] = dp[i-1];
		}
		
		*/
