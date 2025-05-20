package trees;

import java.util.*;

public class Kefa_and_Park {
	
	private static int count = 0;
	private static List<List<Integer>> adj;
	static int n,m;
//	static Vector<Integer>adj[];
	static int cats[];
	static boolean vis[];
	
	private static int dfs( int cur, int cat) {
		// TODO Auto-generated method stub
		vis[cur] = true;
		int ans = 0;
		
		if(cats[cur] == 1)
			cat += 1;
		else
			cat = 0;
		if(cat > m)
			return 0;
		if(adj.get(cur).size() == 1 && cur != 0 ) { 	// to check if the node is leaf node and cat encountered are less than "m"
			ans += 1;
		}
		else {
			for(int next : adj.get(cur)) {
				if(!vis[next]) {
					ans += dfs(next, cat);
				}
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		cats = new int[n];
		vis = new boolean[n];
		for(int i =0; i< n; i++) {
			cats[i] = sc.nextInt();
		}
		adj = new ArrayList();
		for(int i = 0; i< n; i++)
			adj.add(new ArrayList());
		for(int i =0; i< n-1; i++) {
			int u = sc.nextInt() - 1, v = sc.nextInt() - 1;
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
//		System.out.println(adj);
		System.out.println(dfs(0, 0));
//		System.out.println(count);
	}

	

}
