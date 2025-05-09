import java.util.Scanner;

public class Soldier_and_Bananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt(), n = sc.nextInt(), w = sc.nextInt();
		
		int total = (w *(w + 1) * k) / 2 - n;
		if(total < 0)
			System.out.println(0);
		else
			System.out.println(total);
		
	}

}
