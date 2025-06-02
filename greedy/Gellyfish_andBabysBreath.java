package greedy;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Gellyfish_andBabysBreath {
	private static int mod = 998244353;
	private static Scanner sc = new Scanner(System.in);
	private static long[] pow2 = new long[100001];
	public static void main(String[] args) {
		pow2[0] = 1;
		for(int i = 1; i< 100000; i++)
			pow2[i] = 2 * pow2[i - 1] % mod;
		int t =sc.nextInt();
		while(t-- > 0)
			solve();
	}
	private static void solve() {
		int n = sc.nextInt();
		int[] p = new int[n], q = new int[n];
		for(int i =0; i< n; i++)
			p[i] =sc.nextInt();
		for(int i = 0; i< n; i++)
			q[i] = sc.nextInt();
//		print(p);
//		print(q);
		long max_a = -1, max_b = -1;
		int ma = 0, mb = 0;
		for(int r =0; r< n; r++) {
			if(max_a < p[r]) {
				max_a = p[r];
				ma = r;
			}
			if(max_b < q[r]) {
				max_b = q[r];
				mb = r;
			}
			
//			System.out.println(max_a + " " + ma + "  p [] ");
//			System.out.println(max_b + " " + mb + "  q [] ");
			long ans = 0;
			if(max_a < max_b) {
				ans = (pow2[(int)max_b] +  pow2[p[r - mb]]) % mod;
			}else if(max_a > max_b) {
				// if p_value is greater than q_val than 
				// serach the corresponfing q _ val for index i 
				// i.e., i - j
				ans = (pow2[(int)max_a] + pow2[q[r - ma]]) % mod;
			}else {
				ans = (pow2[(int)max_a] + pow2[Math.max(p[r - mb], q[r - ma])] ) % mod;
			}
//			print(a);
			System.out.print(ans + " ");
		}
		
		System.out.println();
	}
}
