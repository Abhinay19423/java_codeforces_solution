import java.util.Scanner;

public class Ilya_and_Queries{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr = new int[s.length() + 1];
		char prev = s.charAt(0);
		for(int i = 1; i< s.length(); i++){
			arr[i] = arr[ i - 1];
			if(s.charAt(i) == prev){
				arr[i] = arr[i - 1] + 1;
			}
			prev = s.charAt(i);
		}
		// System.out.println();
		// for(int i = 0; i< s.length(); i++)
		// 	System.out.print(arr[i] + " ");
		int n = sc.nextInt();
		for(int i = 0; i< n; i++){
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(arr[b -1] - arr[a - 1]);
		}
	}
	
}