import java.util.Scanner;

public class Slavics_Exam {
	
	private static String isSubsequence(String s, String t) {
		int targetLength = t.length(), givenLength = s.length(),curIdx = 0;
		if(givenLength < targetLength)
			return null;
		StringBuilder st = new StringBuilder(s);
		boolean[] flags = new boolean[targetLength];
		for(int i = 0; i< targetLength; i++) {
			while(curIdx < givenLength) {
				if(s.charAt(curIdx) == t.charAt(i) || s.charAt(curIdx) == '?') {
					st.replace(curIdx, curIdx+1, Character.toString(t.charAt(i)));
					flags[i] = true;
					curIdx += 1;
					break;
				}
				curIdx += 1;
			}
		}
		for(int i =0; i< targetLength; i++)
			if(!flags[i])
				return null;
//		System.out.println();
		return st.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		while(T-- > 0) {
//			sc.nextLine();
			String s = sc.next(), t = sc.next();
//			System.out.println(s + "\t" + t);s
			String ans = isSubsequence(s, t);
			if(ans != null) {
//				ans = ;
				System.out.println("YES\n" + ans.replace('?', 'a'));
			}
			else	System.out.println("NO");
		}
	}

}
