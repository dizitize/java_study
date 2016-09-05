package test.algorithm;

import java.util.Arrays;

public class HashFunction {

	String [] theArray;
	int arraySize;
	int itemsInArray = 0 ;
	
	HashFunction(int size)
	{
	   arraySize = size;
	   theArray  = new String[size];
	   Arrays.fill(theArray, "-1");
	}
	
	public void hashFunction1(String[] stringsForArray , String[] theArray )
	{
		for(int n = 0 ; n < stringsForArray.length; n++)
		{
			String newElementval = stringsForArray[n];
			
			theArray[Integer.parseInt(newElementval)] = newElementval;
		}
		
	}
	
	
	public static void main (String[]args)
	{
		HashFunction theFunc = new HashFunction(30);
		String[] elementsToAdd = {"1","5", "17","21","26"};
		
		theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
	}
	
	
	
	
	
}
