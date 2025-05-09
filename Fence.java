import java.util.Scanner;

public class Fence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(), k = scan.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			if(i > 0) {
				a[i] += a[i - 1];
			}
		}
		int idx = 1;
		
		int min = a[k -1];
		
		for(int i = k; i< n; i++) {
			int temp = a[i] -  a[i - k];
//			System.out.print(temp);
			if(min > temp) {
				min =temp;
				idx = i - (k - 2);
			}
		}
		
		
		System.out.println(idx);
		
	}

}

//int idx = 0, min = Integer.MAX_VALUE;

//}
//System.out.println();
