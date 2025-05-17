
import java.util.*;

public class Sereja_and_Suffixe{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m= sc.nextInt();
		int[] arr = new int[n], t = new int[n + 1];
		for(int i = 0; i< n; i++)
			arr[i] = sc.nextInt();
		Set<Integer> set = new HashSet();
		t[n] = 0;
		for(int i = n - 1; i>= 0; i--){
			// System.out.print(t[i -1] + "\t");
			set.add(arr[i]);
			t[i] = set.size();
		 }

		
		 for(int i = 0; i< m; i++){
			 int val = sc.nextInt();
			 System.out.println(t[--val]);
		 }
		 sc.close();

	}

}