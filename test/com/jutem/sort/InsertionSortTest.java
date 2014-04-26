package com.jutem.sort;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSortTest
{
	@Test
	public void SortIncreaseTest()
	{
		InsertionSort.SortIncrease(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	@Test
	public void SrotDecreaseTest()
	{
		InsertionSort.SortDecrease(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private int[] numbers={5,2,4,6,1,3};
}
