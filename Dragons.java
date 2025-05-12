import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dragons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt(), n = sc.nextInt();
		List<int[]> list = new ArrayList<>();
		for(int i =0; i< n; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			list.add(new int[] {x, y});
		}
		
		list.sort((a, b) -> a[0] - b[0]);
		for(int[] vals : list) {
//			System.out.println(vals[0] + "\t" + vals[1]);
			if(s <= vals[0]) {
				System.out.println("NO");
				return;
			}
			else
				s += vals[1];
		}
		
		System.out.println("YES");
	
//		System.out.println(list);
//		
	}

}
