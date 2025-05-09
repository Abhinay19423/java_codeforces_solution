import java.util.Scanner;

public class Stones_on_the_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine(), st = "";
//		System.out.println(s);
		int count = 0;
		char a = s.charAt(0);
		for(int i = 1; i< n; i++) {
//			System.out.println(s.charAt(i-1)+""+(i-1) + "\t" + s.charAt(i)+i);
			if(s.charAt(i) == a) {
				count += 1;
			}else {
				a = s.charAt(i);
			}
		}
		System.out.println(count);
	}

}
