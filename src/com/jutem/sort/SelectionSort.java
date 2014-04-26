package com.jutem.sort;

public class SelectionSort
{
	public static int[] Sort(int[] numbers)
	{
		for(int i=0;i<numbers.length-1;i++)
		{
			int key=numbers[i];
			int tag=i;
			for(int j=i;j<numbers.length-1;j++)
			{
				if(key>numbers[j+1])
				{
					key=numbers[j+1];
					tag=j+1;
				}
			}

			for(int j=tag;j>i;j--)
				numbers[j]=numbers[j-1];

			numbers[i]=key;
		}

		return numbers;
	}

	public static int[] SortOptimize(int[] numbers)
	{
		for(int i=0;i<numbers.length-1;i++) //n
		{
			int key=numbers[i]; //n-1
			int tag=i;  //n-1
			for(int j=i;j<numbers.length-1;j++) //求和i=0到n t
			{
				if(key>numbers[j+1])  //求和i=0到n t-1
				{
					key=numbers[j+1]; //求和i=0到n t-1
					tag=j+1;  //求和i=0到n t-1
				}
			}

			numbers[tag]=numbers[i]; //n-1
			numbers[i]=key;  //n-1
		}
		return numbers;
	}
}
