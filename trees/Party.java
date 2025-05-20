package trees;

import java.util.Scanner;

/*
	We need to divide employees into the minimum number of groups
	such that no employee in a group is a superior of another
	 employee in that same group.
 	This is equivalent to finding the maximum depth among all trees in the forest
 	Each level in a tree can form one group.

No employee in a deeper level will be grouped with a superior since they will be in different groups.

So the maximum height of any of the trees determines the minimum number of required groups.
 */
public class Party {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int[] boss = new int[n + 1];
        for(int i=1; i<=n; i++) {
            int b= sc.nextInt();
            boss[i] = b;
        }
        sc.close();
 
        int result = 0;
        for(int i=1; i<=n; i++) {
            int j = i, depth = 1;
            while (boss[j] != -1) {
                j = boss[j];
 
                depth++;
            }
            result = Math.max(result, depth);
        }
        System.out.println(result);
	}

}
