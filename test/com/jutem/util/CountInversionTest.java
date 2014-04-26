package com.jutem.util;

import org.junit.Test;

public class CountInversionTest
{
	@Test
	public void SrotDecreaseTest()
	{
		CountInversion.CountInversionUseMerge(numbers,0,numbers.length-1);
		for(int number:numbers)
			System.out.print(number+"   ");
		System.out.println();
		System.out.print(CountInversion.getCount());
	}
	private int[] numbers={5,2,4,6,1,3};
}
