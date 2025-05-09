import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        
        if(a*3 > b*2)
        	System.out.println("1");
        else{
        	int count = 0;
        	for(int i = 1; ; i++) {
        		count += 1;
        		a = a* 3;
        		b = b* 2;
        		if(a > b)
        			break;
        	}
        	System.out.println(count);
        };
	}

}


//
//0 0 0 1 0
//0 0 0 0 0 
//0 0 0 0 0 
//0 0 0 0 0
//0 0 0 0 0