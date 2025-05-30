package greedy;
import java.util.Scanner;

public class Anton_and_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int d2 = sc.nextInt(), d3 = sc.nextInt(), d5 = sc.nextInt(), d6 = sc.nextInt();
		
		int mini = Math.min(d5, d6);
		
		int d22 = Math.min(d2, mini),  val = 256 * d22;
		d2 -= d22;
		val += 32 * Math.min(d2, d3);
		
		System.out.println(val);
		

	}

}
