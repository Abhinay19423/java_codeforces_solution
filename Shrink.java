import java.util.Scanner;

public class Shrink {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t= sc.nextInt();
		for(int tt = 0; tt < t; tt++)
			solve();

	}
	private static void solve() {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		System.out.print(2 + " ");
		for(int i = n; i>= 3; i--)
			System.out.print(i + " ");
		System.out.print(1 + "\n");
	}

}
