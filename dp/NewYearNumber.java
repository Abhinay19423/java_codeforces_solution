package dp;

import java.util.Scanner;

public class NewYearNumber {
	private static Scanner sc = new Scanner(System.in);
//	static boolean[] dp = new boolean[1000001];
	static boolean solve(long n) {
		while(n >= 2020 && n % 2021 != 0) {
			n -= 2020;
		}
		return n % 2021 == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
//		dp[0] = true;
		for(int tt = 0; tt < t; tt++) {
			long n = sc.nextLong();
			System.out.println(solve(n) ? "YES" : "NO");
		}
		sc.close();

	}

}


/*
	static boolean solve(long n) {
		long q = n / 2020, r = n % 2020;
		return !(q < r);
	}
*/
