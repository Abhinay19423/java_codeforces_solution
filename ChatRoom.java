import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(), st = "hello";
		int count = 0, j = 0;
		for(char c : st.toCharArray()) {
			while(j < s.length()) {
//				System.out.println(s.charAt(j) + "\t" + c);
				if(s.charAt(j) == c) {
					j+= 1;
					count += 1;
					break;
				}
				j+= 1;
				
			}
		}
		
//		System.out.println(count + "\t" + s.length());
		System.out.println(count == st.length() ? "YES" : "NO");
		
	}

}
