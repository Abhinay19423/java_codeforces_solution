import java.util.*;

public class CoinChange2{

	private static int noOfCoins(int[] coin, int amount){
		int n = coin.length, count = 0;
		// boolean[] v = new boolean[amount + 1];
		int[] t = new int[amount + 1];
		// v[0] = true;
		t[0] = 0;
		for(int i = 0; i< n; i++){
			for(int j = coin[i]; j <= amount ; j++){			
				if(j - coin[i] >= 0){
//					t[j] = t[j] 1 + t[j - coin[i]];
					// v[j] = v[j] | v[j - coin[i]];
				}	
			}
			// if(v[i])
				// count += 1;
		}
		// return count;
		return t[amount];

	}

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] coin = new int[n];
		for(int i = 0; i<n; i++)
			coin[i] = sc.nextInt();
		System.out.println("amount ");
		int amount = sc.nextInt();

		System.out.println(noOfCoins(coin, amount));
	}
}