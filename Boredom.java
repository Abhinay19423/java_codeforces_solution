import java.util.Scanner;

public class Boredom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dp= new int[100001];
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			int val = sc.nextInt();
			dp[val] += 1;
			a[i] = val;
		}
		
		int value = 0;
		
		
		
		
	}

}
