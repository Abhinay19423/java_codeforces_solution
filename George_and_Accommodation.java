import java.util.Scanner;

public class George_and_Accommodation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(),count = 0;
		
		while(n-- > 0) {
			int p = sc.nextInt(), q = sc.nextInt();
			
			if(q - p >= 2)
				count += 1;
		}
		
		System.out.println(count);
	}

}
