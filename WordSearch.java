import java.util.*;

class WordSearch{

	private static int[][] directions = new int[][]{{0 ,1}, {1, 0}, {0, -1}, {-1, 0}};
		
	private static boolean dfs(char[][] grid, String s, int row, int col, int idx){

		if(idx == s.length())
			return true;

		if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || idx > s.length())
			return false;
		
		if(grid[row][col] != s.charAt(idx)){			
			return false;
		}
		boolean res = false;
		char cur = grid[row][col];
		grid[row][col] = '$';
		for(int[] dir : directions){
			int newRow = row + dir[0];
			int newCol = col + dir[1];
			if(newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length)
				res = res | dfs(grid, s, newRow, newCol, idx + 1);
		}
		grid[row][col] = cur;

		return res;
	}

	private static void wordPresent(char[][] grid, String s){
		int n = grid.length, m = grid[0].length;
		boolean flag = true;
		for(int i = 0; i<n; i++ ){
			for(int j= 0; j< m; j++){
				if(s.charAt(i) == grid[i][j] && dfs(grid, s, i, j, i)){
					flag = false;
					System.out.println("YES");
					break;
				}
			}
			if(!flag)
				break;
		}
		if(flag)
			System.out.println("NO");
	}

	
	public static void main(String[] args){
		char[][] grid = new char[][]{
        	{'H', 'E', 'Y', 'A'},
        	{'O', 'L', 'A', 'Y'},
        	{'I', 'L', 'O', 'V'}
    	};

    	int n = grid.length, m = grid[0].length;
    	Scanner sc = new Scanner(System.in);
    	String st = sc.nextLine();

    	wordPresent(grid, st);
    	System.gc();
	}

}

