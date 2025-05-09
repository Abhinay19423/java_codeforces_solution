import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String prev = "";
		int count  = 0;
		while(n-- > 0) {
			String mag = sc.next();
			if(!prev.equals(mag)) {
				prev = mag;
				count += 1;
			}
		}
		System.out.println(count);
	}

}
