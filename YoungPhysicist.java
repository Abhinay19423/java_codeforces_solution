import java.util.Scanner;

public class YoungPhysicist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0, z = 0;
		int n = sc.nextInt();
		
		while(n-- > 0) {
			x += sc.nextInt();
			y += sc.nextInt();
			z += sc.nextInt();
		}
		
		if(x == 0 && y == 0 && z == 0)
			System.out.println("YES");
		else
			System.out.println( "NO");
	}

}
