package Exercise3;

public class CustomDate {
	private String day;
	private String month;
	private String year;
	
	public CustomDate(int month, int day, int year){
		/*
		 * Preconditions: day, month, year > 0 and month < 12 and the number
		 * of days for the given month doesn't exceed the number of days in that 
		 * month
		 * 
		 * Postconditions: Instantiates a class that allows you to transform to the next palindromic
		 * date from the initialized date
		 */
		
		this.day = Integer.toString(day);
		this.year = Integer.toString(year);
		this.month = Integer.toString(month);
	}
	
	public void becomeNextPalindromicDate(){
		this.increment();
		while (!Palindrome.test(this.toString())){
			this.increment();
		}
	}
	
	private void increment(){
		int tempDay = Integer.parseInt(day);
		int tempMonth = Integer.parseInt(month);
		int tempYear = Integer.parseInt(year);
		
		switch (tempMonth){
		case 2:
			if (tempDay < 28)
				tempDay++;
			else{
				tempDay = 1;
				tempMonth++;
			}
			break;
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			if (tempDay < 31)
				tempDay++;
			else{
				tempDay = 1;
				tempMonth++;
			}
			break;
		case 12:
			if (tempDay < 31)
				tempDay++;
			else{
				tempDay = 1;
				tempMonth = 1;
				tempYear++;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (tempDay < 30)
				tempDay++;
			else{
				tempDay = 1;
				tempMonth++;
			}
			break;
		}
		
		day = Integer.toString(tempDay);
		month = Integer.toString(tempMonth);
		year = Integer.toString(tempYear);
	}
	
	public String toString(){
		String tempDay; String tempMonth; String tempYear;
		
		if (Integer.parseInt(day) < 10){
			tempDay = "0"+day;
		}
		else{
			tempDay = day;
		}
		
		if (Integer.parseInt(month) < 10){
			tempMonth = "0"+month;
		}
		else{
			tempMonth = month;
		}
		
		if (Integer.parseInt(year)< 10){
			tempYear = "000"+year;
		}
		else if(Integer.parseInt(year)< 100){
			tempYear = "00"+year;
		}
		else if(Integer.parseInt(year)< 1000){
			tempYear = "0"+year;
		}
		else{
			tempYear = year;
		}
		return tempMonth+tempDay+tempYear;
	}

	public int getYear(){
		return Integer.parseInt(year);
	}
}
