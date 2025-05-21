package trees;

import java.util.Scanner;

public class Sum_in_BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0; i< T; i++) {
			long n = sc.nextLong(), sum = 0;
//			System.out.println(n);
			while(n >= 1) {
				sum = sum + n;
				n = n >> 1;
			}
			System.out.println(sum);
		}
		sc.close();

	}

}
