import java.util.*;
import java.io.*;
 
@SuppressWarnings("unchecked")
public class ConsecutiveSubsequence {
    public static FastScanner fs = new FastScanner();
    public static PrintWriter pw = new PrintWriter(System.out);
 
    public static void main(String[] args) {
        int t = 1;
        //  t = fs.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }
        pw.close();
    }
 
    static void solve() {
        int n = fs.nextInt();
        int[] a = fs.readArray(n);
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0, last = -1;
        for(int i = 0; i < n; i++){
            int add = 1;
            if(map.containsKey(a[i]-1)){
                add = map.get(a[i]-1)+1;
            }
            if(map.containsKey(a[i])){
                map.put(a[i],Math.max(map.get(a[i]),add));
            }
            else map.put(a[i],add);
            if(add > ans){
                last = a[i];
                ans = add;
            }
        }
        pw.println(ans);
        ArrayList<Integer> cur = new ArrayList<>();
        for(int i = n-1; i >= 0; i--){
            if(a[i] == last){
                cur.add(i+1);
                last--;
            }
        }
        for(int i = cur.size()-1; i >= 0; i--){
            pw.print(cur.get(i)+" ");
        }
 
 
    }
 
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
 
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }
    }
 
    public static void debug(Object... o) {
        System.err.print("Line #" + Thread.currentThread().getStackTrace()[2].getLineNumber() + ": ");
        System.err.println(Arrays.deepToString(o));
    }
}