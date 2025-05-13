import java.util.Scanner;

public class Chew_and_Number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.next(), n = "";
		sc.close();
		for(int i = 0; i < x.length(); i++) {
			int val = x.charAt(i) - '0';
//			System.out.println(i + " " + val);
			if(i == 0 && val == 9) {
				n = n + val + "";
				continue;
			}
			else {
				int newVal = Math.abs(val - 9);
				val = Math.min(val, newVal);
				n = n + val + "";
			}
		}
		long val = Long.parseLong(n);
		System.out.println(val);
	}
}

/*
 * 
 * //			if(newVal < val && val != 9)
//				n = n + newVal + "";
//			else
//				n = n + val + "";
///*/
