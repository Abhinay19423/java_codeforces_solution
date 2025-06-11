import java.util.Scanner;

public class Retaliation {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static void solve(int t) {
		int n = sc.nextInt(), idx = -1;
		long sum = 0, mini = Long.MAX_VALUE;
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
//			mini = mini > a[i] ? a[i] : mini;
		}
		long y = (2 * a[0] - a[1]) / (n + 1);
		long x = a[1] - a[0] +  y;
		
		if(x < 0 || y < 0)
		{
			System.out.println("NO");
			return;
		}
//		System.out.println(x + " " + y + " re");
		for(int i = 1; i<= n; i++) {
//			System.out.println(a[i - 1] + " " + (i * x + y * (n - i + 1)) + " " 
//						+ (a[i - 1] != (i * x) + (y * (n - i + 1))));
	        a[i - 1] -= x * (i);
	        a[i - 1] -= y * (n - i + 1);
//			if(a[i - 1] != (i * x) + (y * (n - i + 1))) {
//				System.out.println("NO");
//				return;
//			}
		}
		
		for(int i = 0; i < n; i++) {
			if(a[i] != 0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		for(int i = 0; i< t; i++)
			solve(i+1 );
		sc.close();
	}

}
