import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RegistrationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Set<String> set = new HashSet();
		Map<String, Integer> map = new HashMap();

		
		for(int i= 0; i< n; i++) {
			String s = sc.next();
			if(!set.contains(s)) {
				System.out.println("OK");
			}else {
				String newS = s + (map.getOrDefault(s, 0) + 1);
				System.out.println(newS);
				map.put(s, map.getOrDefault(s, 0) + 1);
			}
			set.add(s);
		}
		sc.close();
	}
}
