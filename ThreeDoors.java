import java.util.Scanner;

public class ThreeDoors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] a = new int[4];
		
		// door of key X to next door[x] 
		// door[x] -> door[door[x]]
		while(t-- > 0) {
			int x = sc.nextInt();
			for(int i = 1; i <= 3; i++)
				a[i] = sc.nextInt();
			if(a[x] == 0 || a[a[x]] == 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		sc.close();
	}

}
