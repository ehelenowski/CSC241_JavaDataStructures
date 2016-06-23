package Lab3;
import ch03.stacks.*;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new java.util.Scanner(System.in);
		
		//For number 42
		System.out.println("Problem 42:"+System.lineSeparator());
		UnboundedStackInterface<String> stack42 = new LinkedStack<String>();
		String command = "";
		while (!command.equalsIgnoreCase("q")){
			System.out.print("Enter a string to push onto the LinkedStack: ");
			stack42.push(in.nextLine());
			System.out.print("Enter q to quit or anything else to push more elements: ");
			command = in.nextLine();
		}
		System.out.println(System.lineSeparator()+"Now the LinkedStack toString() method returns a nice string:");
		System.out.println(stack42.toString());
		
		//For number 46A
		System.out.println("Problem 46A:"+System.lineSeparator());
		System.out.print("To check that the ArrayStack sizeIs() method works, enter a max size of the ArrayStack: ");
		int arrayNum = in.nextInt(); in.nextLine();
		BoundedStackInterface<String> stack46A = new ArrayStack<String>(arrayNum);
		System.out.println("While the ArrayStack is empty, the sizeIs() method should return zero.");
		System.out.println("Now sizeIs() returns: "+stack46A.sizeIs());
		int randNum1 = (int) Math.floor(Math.random()*(arrayNum+1));
		int randNum2 = (int) Math.floor(Math.random()*(randNum1+1));
		System.out.println("Now the ArrayStack will be populated with "+randNum1+" element(s)");
		for (;randNum1 > 0; randNum1--){
			stack46A.push("This goes into the ArrayStack some number of times");
		}
		System.out.println("Now sizeIs() returns: "+stack46A.sizeIs()+System.lineSeparator());
		System.out.println("Now the ArrayStack will have "+randNum1+" element(s) removed");
		for (;randNum2 > 0; randNum2--){
			stack46A.pop();
		}
		System.out.println("Now sizeIs() returns: "+stack46A.sizeIs()+System.lineSeparator());
		
		//For number 46B and 46C
		System.out.println("Problem 46B and 46C:"+System.lineSeparator());
		UnboundedStackInterface<String> stack46BC = new LinkedStack<String>();
		System.out.println("While the LinkedStack is empty, the sizeIs() method should return zero.");
		System.out.println("Now the sizeIs() using traversal returns: "+stack46BC.sizeIsUsingTraversal());
		System.out.println("Now the sizeIs() using an instance variable returns: "+stack46BC.sizeIsUsingInstanceVar());
		int randNum3 = (int) Math.floor(Math.random()*(101));
		int randNum4 = (int) Math.floor(Math.random()*(randNum3+1));
		System.out.println("Now the LinkedStack will be populated with "+randNum3+" element(s)");
		for (;randNum3 > 0; randNum3--){
			stack46BC.push("This goes into the LinkedStack some number of times");
		}
		System.out.println("Now the sizeIs() using traversal returns: "+stack46BC.sizeIsUsingTraversal());
		System.out.println("Now the sizeIs() using an instance variable returns: "+stack46BC.sizeIsUsingInstanceVar());
		System.out.println("Now the LinkedStack will have "+randNum4+" element(s) removed");
		for (;randNum4 > 0; randNum4--){
			stack46BC.pop();
		}
		System.out.println("Now the sizeIs() using traversal returns: "+stack46BC.sizeIsUsingTraversal());
		System.out.println("Now the sizeIs() using an instance variable returns: "+stack46BC.sizeIsUsingInstanceVar());
		
		in.close();
	}

}
