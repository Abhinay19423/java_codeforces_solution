import java.util.Scanner;

public class PleasantPairs {
	private static Scanner sc = new Scanner(System.in);
	
	private static void solve() {
		int n= sc.nextInt();
		int[] a = new int[n];
		for(int i =0; i< n; i++){
			a[i] = sc.nextInt();
		}
		long count = 0;
		for(int i = 0; i< n; i++) {
			for(int j = 1; j * a[i]<= 2 * n; j++) {
				int sum = j * a[i] - i - 2;
//				System.out.println(sum + " " + a[i-1] * a[j -1]);
				if(sum > i && sum < n && a[sum] == j)	count += 1;
			}
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-- > 0) {
			solve();
		}
	}

}
