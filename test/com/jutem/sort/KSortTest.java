package com.jutem.sort;

import java.util.Arrays;

import org.junit.Test;

public class KSortTest {

	@Test
	public void SortIncrease(){
		
		KSort.SortIncreaseInsertion(numbers, 3);
		System.out.println(Arrays.toString(numbers));
	}
	
	private int[] numbers={3,5,6,3,1,4,7,8,2};
}
