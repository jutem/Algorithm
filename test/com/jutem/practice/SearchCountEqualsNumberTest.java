package com.jutem.practice;

import org.junit.Test;

import com.jutem.sort.MergeSort;

public class SearchCountEqualsNumberTest
{
	@Test
	public void SearchForPlusTest()
	{
		MergeSort.Sort(numbers,0,numbers.length-1);
		SearchCountEqualsNumber.SearchForPlus(numbers, 6, 0, numbers.length-1);
	}

	private int[] numbers={5,2,4,6,1,3,9};
}
