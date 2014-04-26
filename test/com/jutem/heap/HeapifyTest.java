package com.jutem.heap;

import java.util.Arrays;

import org.junit.Test;

public class HeapifyTest {

	@Test
	public void MaxHeapifyTest()
	{
		Heapify.MaxHeapify(numbers,1);
		System.out.println(Arrays.toString(numbers));
	}

	@Test
	public void MaxHeapifyWithoutRecursion()
	{
		Heapify.MaxHeapifyWithoutRecursion(numbers,1);
		System.out.println(Arrays.toString(numbers));
	}

	private int[] numbers={10,4,7,6,3,2,1,5};
}
