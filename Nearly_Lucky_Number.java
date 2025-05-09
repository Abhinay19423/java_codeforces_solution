//import java.util.HashSet;
import java.util.Scanner;
//import java.util.Set;

public class Nearly_Lucky_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		int count = 0;
		for(int i =0; i< val.length(); i++)
			if(val.charAt(i) == '4' || val.charAt(i) == '7')
				count += 1;
		if(count == 4 || count == 7)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
