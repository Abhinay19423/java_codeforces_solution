package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BmailComputerNetwork {
	
	static List<List<Integer>> adj;
	static int n;
	static boolean[] vis;
	static List<Integer> path;
	private static void dfs(int cur, List<Integer> list) {
		vis[cur] = true;
		if(cur == n) {
			list.add(cur);
			path = new ArrayList(list);
			return;			
		}
//		if(adj.get(cur).size() <= 0)
//			return;
		list.add(cur);
		
		for(int next : adj.get(cur)) {
			if(!vis[next]) {
				dfs(next, list);
			}
		}
		
		list.remove(list.size() - 1);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		adj = new ArrayList();
		
		n = sc.nextInt();
		vis = new  boolean[n + 1];
		for(int i = 0; i<= n; i++)
			adj.add(new ArrayList());
		
		for(int i = 2; i<= n; i++) {
			adj.get(sc.nextInt()).add(i);
		}
		
		List<Integer> list = new ArrayList();
		dfs(1, list);
//		System.out.println(path);
		for(int vals : path)
			System.out.print(vals + " ");

	}

}
