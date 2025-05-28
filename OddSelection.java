import java.util.Scanner;

public class OddSelection {
	private static Scanner sc = new Scanner(System.in);
	
	private static void solve() {
		
		int n = sc.nextInt(), x = sc.nextInt();
		int[] eveOdd = new int[2];
		
		for(int i = 0; i< n; i++)
			eveOdd[ sc.nextInt() % 2] += 1;
		
		for(int i = 1; i<= eveOdd[1]; i+= 2) {
			if(eveOdd[0] + i >= x && i <= x) {
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int T = sc.nextInt();
		while(T-- > 0) {
			solve();
		}

	}

}
