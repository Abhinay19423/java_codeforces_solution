import java.util.Scanner;

public class Hit_the_Lottery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		int[] bills = new int[] {100, 20, 10, 5, 1};
		for(int i = 0; i< 5; i++) {
			count += n / bills[i];
			n = n % bills[i];
		
		}
		
		System.out.println(count);
		sc.close();
	}
}
