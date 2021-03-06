package ExtraCredit;

public class NumPaths {
	private int[][] pathsAtPoint;
	private int callsToRecursiveMethod;
	private int n;
	
	//Find paths from (1,1) to the point (n,n), only moving up and to the right
	public NumPaths(int n){
	/*
	 * Preconditions: n > 0
	 * 
	 * Postconditions: Instantiates a class that allows you to find the number of paths from
	 * a point to the point (n,n), only moving up and to the right, but not diagonally.
	 */
		this.n = n;
		pathsAtPoint = new int[n][n];
		callsToRecursiveMethod = 0;
	}
	
	public int findPathsFrom(int row, int col){
	/*
	 * Preconditions: 0 < row < n and 0 < col < n
	 * 
	 * Postconditions: Returns the number of paths you can take from (row, col) to the point
	 * (n,n) by only going right and up.
	 */
		callsToRecursiveMethod++;
		if (row == n || col == n)
			return 1;
		else if (pathsAtPoint[row-1][col-1] == 0)
			pathsAtPoint[row-1][col-1] = findPathsFrom(row+1, col) + findPathsFrom(row, col+1);
		return pathsAtPoint[row-1][col-1];
	}
	
	public int getNumCalls(){
		return callsToRecursiveMethod;
	}
}
