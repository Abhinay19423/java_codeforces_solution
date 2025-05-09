import java.util.*;
import java.lang.*;
import java.io.*;

class StringWithDistinctCharacters
{
	private static int isSame(char[] arr1, char[] arr2){
		int[] charA = new int[26];
		for(char c : arr1){
			charA[c - 'a'] += 1;
		}
		int count = 0;
		for(char c : arr2){
			if(charA[c - 'a'] > 0){
				charA[c - 'a'] -= 1;	
			}else
				count += 1;
		}
		return count;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s = "abhinayp";
		String t = "greeshma";
		int[][] q = {{1, 3}, {1, 5},{3, 5}};
		try{
			for(int i = 0; i< q.length; i++){
				try{
					int l = q[i][0], r = q[i][1];
					// System.out.println(s.substring(l-1, r) +"\t" + t.substring(l-1, r));
					System.out.println(isSame(s.substring(l-1, r).toCharArray(), t.substring(l-1, r).toCharArray()));
				}catch(Exception e){
					System.out.println("Ab " + i);
					e.printStackTrace();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

/*
int[] arr = {1, 3, 2, 4, 1};
		int n = arr.length;
		int maxi = -1;
		for(int i =0; i< n; i++)
			maxi = i % 2 == 0 ? Math.max(maxi, arr[i]) : maxi;
			
		System.out.println(maxi);*/