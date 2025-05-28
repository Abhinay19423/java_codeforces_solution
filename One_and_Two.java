import java.util.Scanner;

public class One_and_Two {
	private static Scanner sc  = new Scanner(System.in);
	private static void solve() {
		int n = sc.nextInt(), sum = 0, s = 0;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i] == 2 ? 1 : 0;
		}
		
//		System.out.print(sum + "\t");
		for(int i = 0 ;i< n -1; i++) {
			s += a[i] == 2 ? 1 : 0;
			if(s == sum - s) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(-1);
		
	}
	public static void main(String[] args) {
		
		
		int t = sc.nextInt();
		while(t-- > 0) {
			solve();
		}
		
	}

}
