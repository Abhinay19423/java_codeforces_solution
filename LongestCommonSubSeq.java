/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LongestCommonSubSeq
{
	
	/*private static int recur(String s, String t, int i, int j){
		if(i >= s.length() || j >= t.length())
			return 0;
		int value = 0;
		if(s.charAt(i) == t.charAt(j)){
			value = 1 + recur(s, t, i+1, j+1);
		}else{
			value = Math.max(recur(s, t, i, j + 1), recur(s, t, i+1, j));
		}
		return value;
	}	*/
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s1 = "gekeks", s2 = "gexek";
		// System.out.println(recur(s1, s2, 0, 0));
		int n = s1.length(), m = s2.length();
		int[][] t = new int[n+1][m+1];
		
		for(int i = 0; i<=n; i++){
			for(int j = 0; j<= m; j++){
				if(i == 0 || j == 0)
					t[i][j] = 0;
				else if(s1.charAt(i-1) == s2.charAt(j - 1))
					t[i][j] = 1 + t[i-1][j-1];
				else
					t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
			}
		}
		int len = t[n][m];
		String s = "";
		for(int i=n; i>0; i--){
			for(int j = m; j>0; j--){
				if(s1.charAt(i-1) == s2.charAt(j-1) && t[i][j] == len){
					// System.out.print(s1.charAt(i) +"\t" + s2.charAt(j))
					s = s1.charAt(i-1) + s;
					len -= 1;
				}
			}
		}
		System.out.println(t[n][m] +"\t" + s);
	}
}