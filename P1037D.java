import java.util.*;
import java.io.*;

/**
 * created at 9/4/18 8:16 AM
 */

public class P1037D {

  private static void solve() {
    int n = nextInt();
    Queue<Integer> queue = new LinkedList<>();

    List<List<Integer>> edges = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      edges.add(new ArrayList<>());
    }
    for (int i = 0; i < n - 1; i++) {
      int a = nextInt();
      int b = nextInt();

      edges.get(a).add(b);
      edges.get(b).add(a);
    }

    int[] bfs = new int[n];

    for (int i = 0; i < n; i++) {
      bfs[i] = nextInt();
    }

    boolean[] vis = new boolean[n + 1];

    boolean valid = true;
    int cur = 0;
    queue.add(1);
    vis[1] = true;
    int index = 1;

    while (!queue.isEmpty()) {
      Integer last = queue.remove();
      if (last != bfs[cur]) {
        valid = false;
        break;
      }
      cur++;

      List<Integer> e = edges.get(last);
      HashSet<Integer> set = new HashSet<>();
      for (int i = 0; i < e.size(); i++) {
        if (!vis[e.get(i)]) {
          set.add(e.get(i));
        }
      }
      for (int i = 0; i < set.size(); i++) {
        int next = bfs[index++];
        if (!set.contains(next)) {
          valid = false;
          break;
        }
        vis[next] = true;
        queue.add(next);
      }
    }

    System.out.println(valid ? "Yes" : "No");
  }

  private static void run() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);

    solve();

    out.close();
  }

  private static StringTokenizer st;
  private static BufferedReader br;
  private static PrintWriter out;

  private static String next() {
    while (st == null || !st.hasMoreElements()) {
      String s;
      try {
        s = br.readLine();
      } catch (IOException e) {
        return null;
      }
      st = new StringTokenizer(s);
    }
    return st.nextToken();
  }

  private static int nextInt() {
    return Integer.parseInt(next());
  }

  private static long nextLong() {
    return Long.parseLong(next());
  }

  public static void main(String[] args) {
    run();
  }
}