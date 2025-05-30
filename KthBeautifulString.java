
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class KthBeautifulString {
	private static Scanner sc = new Scanner(System.in);
	private static void solve() {
		long n = sc.nextLong(), k = sc.nextLong();
		char[] s = new char[(int)n];
		Arrays.fill(s,  'a');
		for(int i= (int)n - 2; i>=0; i--) {
			if(k <= (n - i - 1)) {
				//leftmost
				s[(int)i] = 'b';
				s[(int)n - (int)k] = 'b';
				System.out.println(new String(s));
				return;
			}
			k -= (n - i - 1);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		int t =sc.nextInt();
		while(t-- > 0)
			solve();
		sc.close();
	}
}

/*
	For example, if n=5 the strings are (the order does matter):
	aaabb 
	aabab
	aabba
	abaab
	ababa
	abbaa
	baaab
	baaba
	babaa
	bbaaa  
	
	i = 1 aaabb
		[n-1, n]
	i = 2 aabab, aabba
		[n-2, n], [n-2, n-1]
	i = 3 abaab, ababa, abbaa
		[n-3, n], [n-3, n-1], [n-3, n-2]
	i = 4 baaab, baaba, babaa, bbaaa
		[n - 4, n], [n-4, n -1], [n-4, n-2], [n-4, n- 3]
*/
