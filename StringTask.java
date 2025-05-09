import java.util.Scanner;

public class StringTask {
	
	private static boolean isVowel(char c ) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c =='y')
			return true;
		return false;
	}
	
	//"A", "O", "Y", "E", "U", "I",

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().toLowerCase();
		StringBuilder st = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(!isVowel(c)) {
				st.append('.');
				st.append(c);
			}
		}
		
		System.out.println(st.toString());
	}

}
