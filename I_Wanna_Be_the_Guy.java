import java.util.Scanner;

public class I_Wanna_Be_the_Guy {

	private static String solve() {
Scanner sc = new Scanner(System.in);
		
		int maxLevel = sc.nextInt();
		
		boolean[] levelPass = new boolean[maxLevel + 1];
		
		int p = sc.nextInt();
		for(int i = 0; i< p; i++)
			levelPass[sc.nextInt()] = true;
		
		int q = sc.nextInt();
		for(int i = 0; i< q; i++)
			levelPass[sc.nextInt()] = true;
		
		sc.close();
		
		for(int i = 1; i<= maxLevel; i++)
			if(!levelPass[i]) {
				return "Oh, my keyboard!";
			}
		return "I become the guy.";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve());

	}

}
