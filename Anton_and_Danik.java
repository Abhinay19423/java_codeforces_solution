import java.util.Scanner;

public class Anton_and_Danik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String s = scan.next();
		int[] value = new int[5];
		for(int i = 0; i< s.length(); i++) {
			value[s.charAt(i) - 'A'] += 1;
		}
		
		int valueA = value['A' - 'A'], valueD = value['D' - 'A'];
		
		if(valueA < valueD)
			System.out.println("Danik");
		else if(valueA > valueD)
			System.out.println("Anton");
		else
			System.out.println( "Friendship");
		
	}

}
