package com.jutem.heap;

import java.util.Arrays;

import org.junit.Test;

public class MaxPriorityQueueTest {

	@Test
	public void HeapExTractMaxTest()
	{
		for(int i=0;i<numbers.length;i++)
			System.out.print(MaxPriorityQueue.HeapExtractMax(numbers)+"  ");
	}

	@Test
	public void HeapIncreaseKeyTest()
	{
		MaxPriorityQueue.HeapIncreaseKey(numbers, 6, 11);
		System.out.println(Arrays.toString(numbers));
	}

	@Test
	public void InsertTest()
	{
		int[] result=MaxPriorityQueue.Insert(numbers, 9);
		System.out.println(Arrays.toString(result));
	}
	
	@Test 
	public void DeleteTest()
	{
		int[] result=MaxPriorityQueue.Delete(numbers, 2);
		System.out.println(Arrays.toString(result));
	}

	private int[] numbers={10,8,7,6,5,4,3};
}
