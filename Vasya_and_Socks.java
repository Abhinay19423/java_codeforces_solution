import java.util.Scanner;

public class Vasya_and_Socks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt(), count = 0;
		
		while(n > 0) {
			n--;
			count += 1;
			if(count % m == 0)
				n++;
		}
		
		System.out.println(count);

	}

}
