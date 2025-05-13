import java.util.Scanner;
import java.util.Stack;

public class Move_Brackets {
	
	public static void solve(int n, String s ) {
		int ans = 0;
//		String s = sc.nextLine();
		Stack<Character> st = new Stack<>();
		
		for(int i= 0; i< n; i++) {
			char c = s.charAt(i);
			if(st.isEmpty() && c == ')')
				ans += 1;
			else if(c == ')')
				st.pop();
			else	st.push(c);
				
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T-- > 0) {
			int n = sc.nextInt();
			String s = sc.next();
//			System.out.println(n + " " + s);
			solve(n, s);
			
			
		}
	}

}
