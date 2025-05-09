import java.util.Scanner;

public class Calculating_Function {
	
//	private static long sum(long a, long n, long d) {
//		return (long) (0.5 * n * ( 2 * a + (n - 1) * d));
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
				
		//observation 1 : ->  -1 + 2 - 3 + 4 = 2 if n is even then answer is n/2
		//observation 2 : ->  -1 + 2 - 3 + 4 - 5 = -3 if n is odd then answer is -(n+1)2
		System.out.println(n%2 == 0 ? n/2 : -(n+1) / 2);
	}

}
