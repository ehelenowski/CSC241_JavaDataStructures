package Lab6;

import lists.RefUnsortedList;

public class Lab6 {

	//Demonstrates that the removeAll method works, tested on the requested list.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RefUnsortedList<Integer> test = new RefUnsortedList<Integer>();
		test.add(3);
		test.add(4);
		test.add(3);
		test.add(5);
		test.add(3);
		test.add(6);
		test.add(3);
		test.add(3);
		test.add(7);
		System.out.println("The list is initially: \n"+test);
		test.removeAll(3);
		System.out.println("After running removeAll(3), the list is: \n"+test);
		
	}

}
