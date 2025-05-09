import java.util.*;
import java.lang.*;
import java.io.*;

public class ValidBFS_Re
{
	private static boolean bfs(ArrayList<ArrayList<Integer>> adj, int n, ArrayList<Integer> list){
		boolean[] vis = new boolean[n + 1];
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		vis[1] = true;
        	int idx = 0, nextIdx = 1;
		while(!q.isEmpty()){
			int node = q.remove();
			if(node != list.get(idx))
				return false;
			idx += 1;
			List<Integer> nei = adj.get(node);
			HashSet<Integer> set = new HashSet<>();
			//adding the non-visited  neighbours to the set 
			// to check if any given 
			for(int i = 0; i< nei.size(); i++){
				if(!vis[nei.get(i)])
					set.add(nei.get(i));
			}
			for(int i = 0; i< set.size(); i++){
				// if(nextIdx <list.size())
				int nextValue = list.get(nextIdx);
				if(!set.contains(nextValue))
					return false;
				vis[nextValue] = true;
				q.add(nextValue);
				nextIdx += 1;				
			}			
		}
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nfNode = n;		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i= 0; i<= n; i++)
			adj.add(new ArrayList<Integer>());
		ArrayList<Integer> l = new ArrayList<>();
		while(n-- > 1){
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}		
		for(int i =0; i< nfNode; i++){
			int val = sc.nextInt();
			l.add(val);
		}
		sc.close();
		if(bfs(adj, nfNode, l))
		    System.out.println("Yes");
		else System.out.println("No");   					
	}
}