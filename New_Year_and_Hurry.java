import java.util.Scanner;

public class New_Year_and_Hurry {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		
		int totalTimeReq = 4 * 60 - k, count = 0;
//		System.out.println(totalTimeReq);
		for(int i = 1; i <= n + 1; i++) {
//			System.out.println(totalTimeReq - 5 * i);
			if(totalTimeReq - 5 * (i *(i + 1) / 2) >= 0) {
				count += 1;
			}else {
				System.out.println(i - 1);
				return;
			}
		}
		System.out.println(n);
		
	}

}
