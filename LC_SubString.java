 	 /* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LC_SubString
{
	/*private static boolean isPalindrome(String s, int start, int end){
		if(start == end)
			return true;
		if(s.charAt(start) != s.charAt(end))
			return false;
		if(start <= end)
			return isPalindrome(s, start+1, end-1);
		return true;
	}*/
	/*private static int LCSubS(String s, String t, int i, int j){
		if(i >= s.length() || j >= t.length())
			return 0;
		int take = 0;
		if(s.charAt(i) == t.charAt(j)){
			take = 1 + LCSubS(s, t, i+1, j+1);
		}
		// int notTake = Math.max(LCSubS(s, t, i+1, j), LCSubS(s, t, i, j+1));
		return Math.max(take, notTake);
	}*/
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s = "abcdeabhinayabhinay", t = "abhinayabhinaybacdeabhinayabhinayabhinay";
		// System.out.println(isPalindrome(st, 0, st.length()-1));
		int n = s.length(), m = t.length(), maxi = 0;
		int[][] t1 = new int[n+1][m+1];
		int row = -1, col = -1;
		for(int i=1; i<=n; i++){
			for(int j = 1; j<=m; j++){
				if(s.charAt(i-1) == t.charAt(j-1)){
					t1[i][j] = 1 + t1[i-1][j-1];
				}else{
					t1[i][j] = 0;
				}
				if(maxi < t1[i][j]){
					maxi = t1[i][j];	
					row = i; 
					col = j;
				}				
			}
		}
		// System.out.println(LCSubS(s,t, 0, 0));		
		String st = "";
		for(int i = row-1; i>= 1; i--){
			for(int j = col-1;  j >= 1; j--){
				if(s.charAt(i) == t.charAt(j)){
					// st.append(s.charAt(i));
					st = s.charAt(i) + st;
					break;
				}
			}
		}

		System.out.println(t1[n][m] + "\t" + maxi + "\t" + st.toString());
	}
}