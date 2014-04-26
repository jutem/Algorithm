package com.jutem.sort;

import java.util.Arrays;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void QuickSortIncreaseTest()
	{
		QuickSort.QuickSortIncrease(numbers, 0, numbers.length-1);
		System.out.println(Arrays.toString(numbers));
	}
	
	@Test
	public void RadnomQuickSortIncreaseTest()
	{
		QuickSort.RandomQuickSortIncrease(numbers, 0, numbers.length-1);
		System.out.println(Arrays.toString(numbers));
	}
	
	@Test
	public void HoareQuickSortIncreaseTest()
	{
		QuickSort.HoareQuickSortIncrease(numbers, 0, numbers.length-1);
		System.out.println(Arrays.toString(numbers));
	}

	@Test
	public void ForSameNumberQuickSortIncreaseTest()
	{
		QuickSort.ForSameNumberQuickSortIncrease(numbers, 0, numbers.length-1);
		System.out.println(Arrays.toString(numbers));
	}

	
	private int[] numbers={5,2,4,3,6,7,5,1,3,5,23,5,3};
}
