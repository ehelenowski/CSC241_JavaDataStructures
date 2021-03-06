package Exercise3;

public class PalindromicDates {

	public static String inYear(int year){
		/*
		 * Preconditions: Year > 0 
		 * 
		 * Postconditions: Returns a string of all the palindromic dates in a give year
		 */
		
		String toBeReturned = "";
		CustomDate toBeTested = new CustomDate(1,1,year);
		
		if (Palindrome.test(Integer.toString(year))){
			toBeReturned += toBeTested.toString()+System.lineSeparator();
		}
			
		while (toBeTested.getYear() == year){
			toBeTested.becomeNextPalindromicDate();
			if (toBeTested.getYear() == year)
				toBeReturned += toBeTested.toString() + System.lineSeparator();
		}
		
		return toBeReturned;
	}
}
