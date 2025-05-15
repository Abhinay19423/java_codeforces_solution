import java.util.Scanner;

public class RowGCD {
	
	private static long gcd(long a, long b) {
		if(b == 0)	return a;
		return gcd(b,  a % b);
	}
	
	//TC = O(log(a) + log(b))
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		long val = sc.nextLong(), d = 0;
		
		for(int i =1; i< n; i++) {
			long next = sc.nextLong();
			d = gcd(Math.abs(next - val), d);
		}
		for(int i = 0; i< m; i++) {
			long b = sc.nextLong();
			System.out.print(gcd(val + b, d) + " ");
		}	
	}
}


/*
	
	gcd(a, b) = gcd(a, |a - b|) = gcd(|a - b|, a)
	
	gcd(a1, a2, a3) = gcd(a1, gcd(a2, a3))
	
	gcd(a1, a2, a3, a4) = gcd(a4, gcd(a1, a2, a3))
	
	
*/
