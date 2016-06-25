package ExtraCredit;

public class ExtraCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumPaths test = new NumPaths(4);
		System.out.print("From the point (1,1) to (4,4), there are: ");
		System.out.print(test.findPathsFrom(1, 1));
		System.out.print(" paths\n");
		System.out.println("This took "+ test.getNumCalls() + " calls to the recursive method");
	}
	/*
	 * C. The numPaths class shows that I was able to use the approach of dynamically
	 * programming the solution using a two dimensional array of integers to cut down on
	 * the number of calls to the recursive method.
	 * 
	 * D. Here in the main method, I show the invocation of this version of numPaths. No array
	 * initialization is necessary for the applications programmer. It is all done within the 
	 * numPaths class.
	 * 
	 * E. In terms of time efficiency, this newer version of numPaths is must faster than the older
	 * version of numPaths. In the old version of numPaths, it took 39 calls to get the answer
	 * to the number of paths from (1,1) to (4,4) but using this new method with the two dimensional
	 * array of integers, it took only 19 calls, or about half. Clearly, you can see that in terms of 
	 * time efficiency, this new algorithm is much more efficient because it skips over redundancies
	 * and avoids recalculation of points. In terms of space efficiency, this program may take up slightly
	 * more static memory as there is the use of the two dimensional integer array, but it takes up 
	 * much less dynamic memory, as there are less calls to the recursive method (39 to just 19 calls), so
	 * its safe to say that this algorithm is more space efficient given that it doesn't rely as 
	 * heavily on your systems call stack. However, the older algorithm did take up less static memory, even 
	 * though a two dimensional array of integers, being a primitive type, won't make it a huge difference.
	 * 
	 */

}
