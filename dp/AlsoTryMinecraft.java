package dp;
import java.util.Scanner;

public class AlsoTryMinecraft {
	
	private static long[] a, asc, desc;
	
	private static void print(long[] arr) {
		for(long val : arr)
			System.out.print(val + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m =sc.nextInt();
		a = new long[n];
		asc = new long[n];
		desc = new long[n];
		
		for(int i = 0; i< n; i++)
			a[i] = sc.nextLong();
		
		for(int i= 1; i< n; i++)
			asc[i] = asc[i-1] + Math.abs(a[i] < a[i-1] ? a[i-1] - a[i] : 0);
		
		for(int i = n - 2; i >= 0; i--)
			desc[i] = desc[i + 1] +  Math.abs(a[i] < a[i+1] ? a[i] - a[i +1] : 0);
		
//		print(a);
//		print(asc);
//		print(desc);
		
		for(int i= 0; i< m; i++) {
			int left= sc.nextInt(), right = sc.nextInt();
			if(left < right)
				System.out.println(Math.abs(asc[right - 1] - asc[left - 1]));
			else
				System.out.println(Math.abs(desc[right - 1] - desc[left - 1]));
			
		}
		
		sc.close();

	}

}
