import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int upper = 0, lower = 0;
		
//		StringBuilder st = new StringBuilder();
		
		for(char c : s)		if(c >= 'A' && c <= 'Z')	upper += 1;
		
		if(upper > lower) {
			System.out.println(new String(s).toUpperCase());
			
		}else {
			System.out.println(new String(s).toLowerCase());
		}
		
		
			
	}

}
