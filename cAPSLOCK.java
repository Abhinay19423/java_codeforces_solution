import java.util.Scanner;

public class cAPSLOCK {
	
	private static boolean isLower(char c) {
		if(c >= 'a' && c <= 'z')
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		sc.close();
//		System.out.println(s.substring(1).toUpperCase().equals(s.substring(1)));
		if(s.substring(1).toUpperCase().equals(s.substring(1))) {
			boolean b = false;
			if(Character.isLowerCase(s.charAt(0)))	b = true;
			System.out.println(!b ? s.toLowerCase()
					:
				Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase());
		}
		else
			System.out.println(s);
		

	}

}
