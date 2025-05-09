import java.util.Scanner;

public class Drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double total = 0;
		
		for(int i =0; i < n; i++)
			total += sc.nextInt();
		
		String s = total/ (double) n + "";
//		if(s.length() < )
		
		System.out.println(s);
	}

}
