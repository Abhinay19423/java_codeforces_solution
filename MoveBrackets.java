import java.util.Scanner;
import java.util.Stack;

public class MoveBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			
			String input = sc.nextLine();
			
			System.out.println(solve(input, n));
			
		}
		
	}

	private static int solve(String input, int n) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			char c = input.charAt(i);
			if(st.isEmpty() && c == ')') {
				st.push(c);
			}else if(c == '(') {
				st.push(c);
			}else
				st.pop();
		}
		
		return st.size();
	}

}
