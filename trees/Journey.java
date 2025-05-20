package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Journey {
	
	private static double dfs(List<List<Integer>> adj, int src, int parent) {
		double val = 0.000000000000, nchild = 0.000000000000;
//		System.out.println("begins .. ");
		for(int next : adj.get(src)) {
//			System.out.println(next + " ");
			if(next != parent) {
				++nchild;
				val += dfs(adj, next, src);
			}
		}
//		System.out.println("end .. ");
		
		if(nchild == 0)		return 0;
		
		return 1.000000000000 + val / nchild;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
		List<List<Integer>> adj = new ArrayList();
		
		int n = sc.nextInt();
		for(int i= 0; i< n; i++)
			adj.add(new ArrayList());
		
		for(int i= 0; i< n - 1; i++) { // n-1 because for n node there are n - 1 edges
			int src = sc.nextInt() - 1, dest = sc.nextInt() - 1;
			adj.get(src).add(dest);
			adj.get(dest).add(src);
		}
		
		System.out.println(dfs(adj, 0, -1));
		
		sc.close();

	}

}
