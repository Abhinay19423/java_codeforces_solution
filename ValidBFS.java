import java.util.*;

class ValidBFS{
	public static void main(String[] args){
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer>[] adj = new  ArrayList[n];
		boolean[] visited = new boolean[n+1];
		Arrays.fill(visited, false);
		for(int i= 0; i< n; i++){
			adj[i] = new ArrayList<>();
		}
		for(int i =0; i<n; i++){
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj[u].add(v);
			adj[v].add(u);
		}

		List<Integer> list = new ArrayList<>();
		for(int i = 0; i< n; i++){
			int val = sc.nextInt();
			list.add(val);
		}
		List<Integer> res = new ArrayList<>();
		pq.add(1);
		visited[1] = true;
		while(!pq.isEmpty()){
			int u = pq.remove();
			res.add(u);
			// visited[neighbor] = true;
			List<Integer> nei = adj[u];
			for(int neighbors : nei){
				if(!visited[neighbors]){
					pq.add(neighbors);
					visited[neighbors] = true;
				}
			}

		}
		boolean flag = true;
		for(int i = 0; i< list.size(); i++)
			if(list.get(i) != res.get(i)){
				System.out.println("NO");
				flag = false;
			}
				
		if(flag)
			System.out.println("YES");
			
	}
}

