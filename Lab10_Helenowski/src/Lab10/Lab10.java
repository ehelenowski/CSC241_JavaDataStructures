package Lab10;

import java.util.Random;

	public class Lab10 {
		static final int SIZE = 100; // size of array to be sorted
		static final int RANDSAMP = 10;
		static int[] values = new int[SIZE];   // values to be stored
		static int[] values2 = new int[10];		// random values to be searched for

	static void initValues()
	  // Initializes the values array with random integers from 0 to 99.
	  {
	    Random rand = new Random();
	    for (int index = 0; index < SIZE; index++)
	      values[index] = Math.abs(rand.nextInt(100001));
	    for (int i = 0; i < RANDSAMP; i++)
	    	values2[i] = values[Math.abs(rand.nextInt(SIZE+1))]; 
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initValues();
		HashTable sizeSeven = new HashTable(7,2); //Create a hash table with a size of 7, relative prime given is 2
		HashTable sizeFiftyOne = new HashTable(51,5); //Create a hash table with a size of 51, relative prime given is 5
		HashTable sizeOneFiftyOne = new HashTable(151,25); //Create a hash table with a size of 151, relative prime given is 25
		
		//Populate the Hash Tables
		for (int i = 0; i < values.length ; i++){
			sizeSeven.add(new HashableInt(values[i]));
			sizeFiftyOne.add(new HashableInt(values[i]));
			sizeOneFiftyOne.add(new HashableInt(values[i]));
		}
		
		//Print the stored values of the Hash Tables
		System.out.println(sizeSeven);
		System.out.println(sizeFiftyOne);
		System.out.println(sizeOneFiftyOne);
		
		//Search for 10 random numbers in each hash table, show weather the table contains the number and how many comparisons it took to find it or not
		System.out.println("Table Size:\tSearch Value:\tTable Contains?:\t# Comparisons:\t");
		for (int i = 0; i < values2.length; i++){
			System.out.println(sizeSeven.getSize()+"\t\t"+values2[i]+"\t\t"+sizeSeven.contains(new HashableInt(values2[i]))+"\t\t\t"+sizeSeven.getNumberCompares());
			System.out.println(sizeFiftyOne.getSize()+"\t\t"+values2[i]+"\t\t"+sizeFiftyOne.contains(new HashableInt(values2[i]))+"\t\t\t"+sizeFiftyOne.getNumberCompares());
			System.out.println(sizeOneFiftyOne.getSize()+"\t\t"+values2[i]+"\t\t"+sizeOneFiftyOne.contains(new HashableInt(values2[i]))+"\t\t\t"+sizeOneFiftyOne.getNumberCompares());
		}
	}

}
