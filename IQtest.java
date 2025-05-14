import java.util.Scanner;

public class IQtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i< n; i++) 
			arr[i] = scan.nextInt();
		int idxEven = -1, even = 0, odd = 0, idxOdd = -1;
		for(int i = 0; i< n; i++) {
			if(arr[i] % 2 == 0) {
				even += 1;
				idxEven = i;
			}else {
				odd += 1;
				idxOdd = i;
			}
		}
		
		if(even > odd) {
			System.out.println(idxOdd+ 1);
			return;
		}
		System.out.println(idxEven + 1);
		
	}

}
