package com.jutem.sort;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortTest
{
	@Test
	public void SortTest()
	{
		MergeSort.Sort(numbers,0,numbers.length-1);
		System.out.println(Arrays.toString(numbers));
	}

	@Test
	public void SortWithoutSentinelTest()
	{
		MergeSort.SortWithoutSentinel(numbers,0,numbers.length-1);
		System.out.println(Arrays.toString(numbers));
	}

	private int[] numbers={5,2,4,6,1,3,9};
}
