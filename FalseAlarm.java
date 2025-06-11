import java.util.Scanner;

public class FalseAlarm {

	private static Scanner sc = new Scanner(System.in);
	
	private static void solve() {
		int n = sc.nextInt(), x = sc.nextInt(), sum = 0;
		int[] a = new int[n];
		for(int i =0; i< n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		if(sum == 0) {
			System.out.println("YES");
			return;
		}
		
		for(int i =0; i< n; i++) {
			if(a[i] == 1 && x > 0) {
				while(i < n && x > 0 && sum > 0) {
					sum -= a[i];
					a[i++] = 0;
					x -= 1;
				}
			}
		}
//		for(int i = 0; i < n; i++)
//			if(a[i] == 1) {
//				System.out.println("NO");
//				return;
//			}
		System.out.println(sum == 0 ? "YES" : "NO");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		for(int tt = 0; tt < t; tt++)
			solve();
		sc.close();
	}

}
