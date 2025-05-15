import java.util.Scanner;

public class Boredom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), maxi = Integer.MIN_VALUE;
		long maxCount = 0;;
		
		long[] dp= new long[1000001]; 
		long[] cnt = new long[1000001];// given a[i] <= 10 ^ 5
		for(int i = 0; i<n; i++) {
			int val  = sc.nextInt();
			cnt[val] += 1;
			maxi = maxi < val ? val : maxi;
		}
		
		dp[0] = 0; //base case 1
		dp[1] = cnt[1];	//base case 2
		
		for(int i = 2; i<= maxi; i++) {
			dp[i] = Math.max(dp[i-1], cnt[i] * i + dp[i - 2]);
			maxCount = maxCount < dp[i] ? dp[i] : maxCount;
		}
		System.out.println(maxCount);
	}

}
