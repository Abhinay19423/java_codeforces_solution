import java.util.Scanner;

public class Kefa_and_First_Steps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int _prev = Integer.MIN_VALUE;
		
		int n = sc.nextInt();
		int maxi = Integer.MIN_VALUE, count = 0;
		for(int i = 0; i< n; i++) {
			int val = sc.nextInt();
//			System.out.println(_prev + "\t" + val + "\t" + count + "\t" + maxi);
			if(_prev <= val) {
				_prev = val;
				count += 1;
			}else {
				_prev = val;
				count = 1;
			}
			maxi = maxi <= count ? count : maxi;
		}
		
		System.out.println(maxi);
		sc.close();
	}

}
