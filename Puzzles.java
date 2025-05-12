import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		int[] difficulites = new int[m];
		
		for(int i = 0; i< m; i++)
			difficulites[i] = sc.nextInt();
		
		Arrays.sort(difficulites);
		
		int mini = difficulites[m-1] - difficulites[0];
		
		for(int i = 0; i< m - n + 1; i++) {
			mini = Math.min(mini, difficulites[i + n - 1] - difficulites[i]);
		}
		
		System.out.println(mini);
	}

}
