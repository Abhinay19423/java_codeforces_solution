import java.util.Scanner;

public class SquareYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0) {
			int n = sc.nextInt();
			
			int value = (int)Math.sqrt(n);
			int a = 0, b = value;
			while(a<= b && (a+b) * (a + b) != n) {
				a += 1;
				b -= 1;
			}
			if(a > b) {
				System.out.println(-1);
			}else
				System.out.println(a + " " + b);

		}
	}

}
