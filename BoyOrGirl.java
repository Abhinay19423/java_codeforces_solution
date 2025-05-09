import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		boolean[] charS = new boolean[26];
		
		for(char c : text.toCharArray()) {
			charS[c - 'a'] = true;
		}
		
		int count = 0;
		
		for(int i= 0; i < 26; i++)
			if(charS[i])
				count += 1;
		
		if(count % 2 == 0)
			System.out.println("CHAT WITH HER!\r\n");
		else
			System.out.println("IGNORE HIM!");
	}

}
