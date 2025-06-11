import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CoolPartition {
	private static Scanner sc = new Scanner(System.in);
	private static void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];

		for(int i= 0; i< n; i++ ) {
			a[i] = sc.nextInt();
		}
		
		Set<Integer> cur = new HashSet(), seen = new HashSet();
		int ans = 0;
		for(int i = 0; i< n; i++) {
			cur.add(a[i]);
			seen.add(a[i]);
			
			if(seen.size() == cur.size()) {
				ans += 1;
				seen = new HashSet();
			}
		}
		System.out.println(ans);
//		System.out.println(map); 
//		System.out.println(map.get(a[0]));
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		for(int ttt = 0 ; ttt< t; ttt++)
			solve();
		sc.close();
	}
}
