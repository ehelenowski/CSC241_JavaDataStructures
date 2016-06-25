package Lab4;

public class Lab4 {

	//To see the stack trace  see the attached text file, HandTrace_23B.txt
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = numPaths(1,1,4); //The book states to test the program for N = 4, starting at the point (1,1)
		System.out.println(test); //You stated to submit the program verifying the correct output. In this case, 20.
	}

	public static int numPaths(int row, int col, int n){
	/* Preconditions: The row and column must either be 1 or less than N
	 *
	 * In the text file you can see the stack trace, as well as
	 * an explanation as to why this is such an inefficient algorithm.
	 *
	 * Postconditions: Returns the number of paths you can take from (row, col) to
	 * the point (n,n) where the only legal moves on the graph are to the right or up.
	 */
		if (row == n || col == n){
			return 1;
		}
		else{
			int movesRight = numPaths(row, col+1, n);
			int movesUp = numPaths(row+1, col, n);
			return movesRight+movesUp;
		}
	}

}
