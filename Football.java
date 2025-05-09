import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int count1 = 0, count0 = 0;
		boolean flag = false;
		for(int i = 0; i< s.length(); i++) {
			if(count1 >= 7 || count0 >= 7) {
				flag = true;
				break;
			}
			if(s.charAt(i) == '1') {
				count1 += 1;
				count0 = 0;
			}
			else {
				count1 = 0;
				count0 += 1;
			}
		}
		if(flag || count1 >= 7 || count0 >= 7)
			System.out.println( "YES" );
		else 
			System.out.println("NO");		
	}

}
