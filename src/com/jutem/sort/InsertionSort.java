package com.jutem.sort;


public class InsertionSort
{
	public static int[] SortIncrease(int[] numbers)
	{
		for(int j=0;j<numbers.length;j++){
			
			int key=numbers[j];
			int i=j-1;
			while(i>=0 && numbers[i]>key){
				
				numbers[i+1]=numbers[i];
				i=i-1;
			}
			numbers[i+1]=key;
		}
		return numbers;
	}
	
	public static int[] SortDecrease(int[] numbers)
	{
		for(int j=0;j<numbers.length;j++)
		{
			int key=numbers[j];
			int i=j-1;
			while(i>=0 && numbers[i]<key)
			{
				numbers[i+1]=numbers[i];
				i=i-1;
			}
			numbers[i+1]=key;
		}
		return numbers;
	}

}
