package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer>[] childrens = new ArrayList[n];
		
		for(int i =0; i< n; i++)
			childrens[i] = new ArrayList<>();
		int[] c = new int[n];
		for(int i =0; i< n; i++) {
			int x = sc.nextInt();
			c[i] = sc.nextInt();
			if(x != -1) {
				--x;
				childrens[x].add(i);
			}	
		}
		
		for(int i =0; i< n; i++) {
			System.out.println(childrens[i]);
		}
		
		sc.close();
	}

}
