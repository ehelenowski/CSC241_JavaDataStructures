package Lab4;

public class Lab4 {

	//To see the stack trace, and the explanation for it, see the attached text file, HandTrace_23B.txt
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = numPaths(1,1,4); //The book states to test the program for N = 4, starting at the point (1,1)
		System.out.println(test); //You stated to submit the program verifying the correct output. In this case, 20. 
	}
	
	public static int numPaths(int row, int col, int n){
	/* Preconditions: The row and column must either be 1 or less than N
	 * 
	 * To see the stack trace, uncomment the print lines (and int declarations). Take note, however,
	 * that the print lines do not necessarily appear logical as you read them. You must take note of
	 * where each activation record is picking up in order to understand the stack trace. This is all explained in
	 * the text file, HandTrace_23B.txt. In that text file you can see the stack trace explained, as well as
	 * an explanation as to why this is such an inefficient algorithm.
	 * 
	 * Postconditions: Returns the number of paths you can take from (row, col) to
	 * the point (n,n) where the only legal moves on the graph are to the right or up.
	 */
//		int tempRow = row, tempCol = col;
		if (row == n || col == n){
//			System.out.println("Another path! You are in the row or column "+n);
			return 1;
		}
		else{
//			System.out.println("Move right from column "+ tempCol +" to column "+(tempCol+1));
			int movesRight = numPaths(row, col+1, n);
//			System.out.println("Move up from row "+ tempRow+" to row "+(tempRow+1));
			int movesUp = numPaths(row+1, col, n);
			return movesRight+movesUp;
		}
	}

}
