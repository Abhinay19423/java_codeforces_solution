import java.util.Scanner;

public class EvenOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k= sc.nextLong();
		
		// no of odds => (n+1) / 2
		// if k < odd indexes then 2k - 1
		// if K > odd indexes then the numbers are even numbers 2(k - no of odd numbers)
		
//		example : if n = 10, k = 3
		//  1 | 3 | 5 | 7 | 9 | 2 | 4 | 6 | 8 | 10 
		//  1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 <- indices 
		// odd count =  5 (10 + 1 / 2) if k = 3 it is less than odd count 2 * k - 1 
		//		==> 2 * 3 - 1 = 6 - 1
		// if k = 7 , i.e., k > odd count , then value = 2 * (k - odd count)
		// 		value = 2 * (7 - 5) = 4
		
		long noOfOdds = (long) (n + 1) / 2;
		if(k <= noOfOdds)	System.out.println((long)2 * k  -1 );
		else	System.out.println((long) 2 * (k - noOfOdds));

	}

}
