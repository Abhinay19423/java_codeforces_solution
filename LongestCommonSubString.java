/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LongestCommonSubString
{	
	private static int LCSubS(String s, String t, int i, int j){
		if(i >= s.length() || j >= t.length())
			return 0;
		if(s.charAt(i) == t.charAt(j))
			return 1 + LCSubS(s, t, i+1, j+1);
		return 0;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s = "abcdefasewweabhinay", t = "bewewabhinay";
		// System.out.println(isPalindrome(st, 0, st.length()-1));
		// System.out.println(LCSubS(s,t, 0, 0));
		
		int n = s.length(), m = t.length(), maxi = 1;
		int[] t1 = new int[n < m ? m : n];
		
		for(int i = 1; i<= n; i++){
			int idx = i;
			for(int j = 1; j<= m; j++){
				if(idx <= n && s.charAt(idx-1) == t.charAt(j - 1)){
					t1[idx] = Math.max(1 + t1[j], t1[idx]);
					maxi = Math.max(maxi, t1[idx]);
					idx+= 1;					
				}
				else{
					t1[idx] = Math.max(t1[idx], t1[j]);
				}
			}
		}
		int idx = 0;
		for(int i = t1.length - 1; i>= 0; i--){
			if(maxi == t1[i]){
				idx = i;
				System.out.println(i);
			}
			System.out.println(t1[i]);
		}
		String res = "";
		for(int i = idx; i> 0; i--){
			if(t1[i] > 0)
				res =  s.charAt(i) + res;
				// System.out.println(s.charAt(i));
			else
				break;
		}
		System.out.println(res);

	}
}

/*

StringBuilder st = new StringBuilder();
		String res = "", res1 = "";
		if(n < m)	
			res1 = t;
		else
			res1 = s;
		System.out.println(res1);
		for(int i = Math.max(n, m); i>= 1; i--){
			if(t1[i] == maxi){
				int j = i;
				for(j = i; j>= 1; j--){
					if(t1[j] <= 0)
						break;
					res = res + res1.charAt(j-1);
				}
				i =j;
			}
		}		
		System.out.println(res)	;*/