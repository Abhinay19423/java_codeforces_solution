import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Dinner_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T-- > 0) {
			
			int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt(), q = sc.nextInt();
			
			if(m *q == q * (n - p + 1))
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}

	}

}
