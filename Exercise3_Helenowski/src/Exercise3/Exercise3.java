package Exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		//Part A, find the next palindromic year after 2002 (comes out to 2112)
		Integer year = new Integer(2002);
		year++;
		while (!Palindrome.test(year.toString())){
			year++;
		}
		System.out.println("The next year after 2002 that is palindromic is: "+year);
		System.out.println(System.lineSeparator());
		
		//Part B, find the first palindromic date of the 21st century. (comes out to 10022001). Format is MMDDYYYY
		CustomDate test = new CustomDate(1,1,2000);
		test.becomeNextPalindromicDate();
		System.out.println("The first palindromic date of the 21st century was: "+test.toString());
		
		//Part C, A program that prompts users for a year, then finds palindromic dates in that year. Format is MMDDYYYY
		Scanner in = new Scanner(System.in);
		do{
			System.out.println(System.lineSeparator());
			System.out.print("Enter a year to see the palindromic dates in that year: ");
			int tempYr = in.nextInt();in.nextLine();
			System.out.println("\nThe palindromic dates are: ");
			System.out.print(PalindromicDates.inYear(tempYr));
			System.out.println(System.lineSeparator());
			System.out.print("Enter q to quit or another key to continue: ");
		}
		while (! in.nextLine().equalsIgnoreCase("q"));
		System.out.println(System.lineSeparator());
		System.out.println("You have chosen to quit! Goodbye!");
		in.close();
	}

}
