package greedy;
import java.util.Scanner;
 
public class Gellyfish_and_TricolorPansy {
	private static Scanner sc = new Scanner(System.in);
	
	private static void solve() {
		long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
		
		long miniG = Math.min(a, c), miniF = Math.min(b, d);
		
		if(miniG < miniF)
			System.out.println("Flower");
		else
			System.out.println( "Gellyfish");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		for(int i =0; i< t; i++)
			solve();
		sc.close();
	}
 
}