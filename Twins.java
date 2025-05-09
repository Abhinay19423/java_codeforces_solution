import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), sum = 0;
		
//		List<Integer> arr = new ArrayList<>();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
//			arr.add(sc.nextInt());
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
//		arr.sort(Collections.reverseOrder());
		Arrays.sort(arr);
		int mini = n, twinSum = 0;
		for(int i = 0; i< n; i++) {
			twinSum += arr[i];
			if(twinSum < sum - twinSum) {
				mini -= 1;
			}
		}
		
		System.out.println(mini);
		
	}

}
