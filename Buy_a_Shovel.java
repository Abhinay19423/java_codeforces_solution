import java.util.Scanner;

public class Buy_a_Shovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt(), r = sc.nextInt();
		sc.close();
//		if(k % 10   == 0 || k % 10 - r == 0) {
//			System.out.println(1);
//			return;
//		}
		
		for(int i = 1; i <= r * 10; i++) {
//			System.out.print(k * i + " ");
			if((k * i) % 10   == 0 || ((k * i) % 10 ) - r == 0) {
				System.out.println(i);
				return;
			}
		}

	}

}
