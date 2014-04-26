package com.jutem.sort;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSortTest
{
	@Test
	public void SortTest()
	{
		SelectionSort.Sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	@Test
	public void SortOptimizeTest()
	{
		SelectionSort.Sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private int[] numbers={5,2,4,6,1,3};
}
