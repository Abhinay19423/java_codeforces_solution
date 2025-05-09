import java.util.Scanner;

public class WrongSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k = sc.nextInt();
		
		while(k-- > 0) {
			if(n % 10 != 0) {
				n -= 1;
			}else
				n /= 10;
		}
		
		System.out.println(n);
		
	}

}
