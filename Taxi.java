import java.util.Scanner;

public class Taxi {

	
	private static void print(int[] carsVolume) {
		System.out.println();
		for(int i = 1; i<5; i++) {
			System.out.print(carsVolume[i] + "\t");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), sum = 0;
		int[] carsVolume = new int[5];
		
		for(int i = 0; i< n; i++) {
			carsVolume[sc.nextInt()] += 1;
		}
		
		sc.close();
//		print(carsVolume);
		int count = carsVolume[4];
		carsVolume[4] = 0;
		int t = Math.min(carsVolume[1], carsVolume[3]);
		carsVolume[1] -= t;
		carsVolume[3] -= t;
		
		count += t;
		count += carsVolume[3];
//		print(carsVolume);
		
		count += (carsVolume[2] * 2 + carsVolume[1] + 3) / 4;
//		System.out.println("\n" +  );
		System.out.println(count);
		
		
		
	}

}


/*


for(int i = 0; i< n; i++)
sum += sc.nextInt();

int value = (int)Math.ceil(sum / 4) + (sum % 4 == 0 ? 0 : 1);
System.out.println(value);


carsVolume[4] = 0;
		int value = Math.min(carsVolume[1] == 0? Integer.MAX_VALUE : carsVolume[1], carsVolume[3]);
		count += value;
		
		print(carsVolume);
		
		carsVolume[1] -= value;
		carsVolume[3] -= value;
		
		print(carsVolume);
		
		value = Math.min(carsVolume[1] <= 0? Integer.MAX_VALUE : carsVolume[1], carsVolume[2]);
		count += value;
		carsVolume[1] -= value;
		carsVolume[3] -= value;
		
		print(carsVolume);
		
		

*/