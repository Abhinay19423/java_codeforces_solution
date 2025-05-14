import java.util.Scanner;

public class Expression {
	static int a, b, c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
//		System.out.println(exp1 + " " + exp2 + " " + exp3 + " " + exp4);
		System.out.println(Math.max(p(), Math.max(r(),q())));
		
		sc.close();

	}
	
	static int p () {
        return Math.max(a+(b*c), c+(b*a));
    }
    static int r () {
        return Math.max(a*(b+c), c*(b+a));
    }
    static int q () {
        return Math.max(a*b*c, a+b+c);
    }

}
