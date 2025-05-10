import java.util.Scanner;

public class Showering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt(), s = sc.nextInt(), m  = sc.nextInt();
			int maxi = 0, prev = 0;
			for(int i = 0; i< n; i++) {
				int a = sc.nextInt(), b = sc.nextInt();
//				System.out.println(a +"\t"+ prev);
				maxi = Math.max(a - prev, maxi);
				prev = b;
			}
			maxi = Math.max(maxi, m - prev);
			System.out.println(maxi >= s ? "YES" : "NO");
		}
	}

}
