import java.util.Scanner;

public class Queue_at_the_School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), t = sc.nextInt(), count = 0;
		sc.nextLine();
		String s = sc.nextLine();
		 
		for(int i = 0; i< n; i++)
			if(s.charAt(i) == 'B')
				count += 1;
		StringBuilder st = new StringBuilder(s);
//		char[] ch = s.toCharArray();
		
		for(int i =0; i< t; i++) {
			for(int j = 0; j<= n-2; j++) {
				if(st.substring(j, j+2).equals("BG")) {
					st.replace(j, j+2, "GB");
					j++; // two steps 
				}
			}
		}

		System.out.println(st.toString());
	}

}

/*
	for(int i = 0; i< n; i++) {
//			System.out.println(new String(ch));
			if(s.charAt(i) == 'B') {
				ch[i] = 'G';
				ch[i+t >= n ? n-1 : i+t] = 'B';
//				t -= 1;
			}
//			System.out.println(t + "\t" + new String(ch));
		}
		System.out.println(new String(ch));
//		System.out.println(count+ "\t" + new String(ch));
 */

