import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sereja_and_Dima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt(), sum = 0, dima = 0;
		int[] arr = new int[n];
		for(int i = 0; i< n; i++)
			arr[i] = sc.nextInt();
		int[] sums = new int[2];
		int left = 0, right = n - 1, q = 0;
		
		while(left <= right) {
			if(arr[left] < arr[right])
				sums[q] += arr[right--];
			else
				sums[q] += arr[left++];
			q ^= 1;
		}
		
		System.out.println(sums[0] + " " + sums[1]);
	}

}
