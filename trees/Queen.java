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
		List<Integer> ans = new ArrayList<>();
		for(int i =0; i< n; i++) {
//			System.out.println((i + 1) + " " + c[i] + " " + childrens[i]);
			if(c[i] == 1) {
				boolean pos = true;
				for(int child : childrens[i]) {
					if(c[child] == 0) {
						pos = false;
						break;
					}
				}
				if(pos) {
					ans.add(i + 1);
				}
			}
		}
		if(ans.size() > 0)
			for(int val : ans)
				System.out.print(val + " ");
		else
			System.out.println(-1);
		
		sc.close();
	}

}
