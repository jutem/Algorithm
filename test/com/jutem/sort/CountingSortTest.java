package com.jutem.sort;

import java.util.Arrays;

import org.junit.Test;

public class CountingSortTest {

	@Test
	public void sortIncreaseTest(){
		
		int[] result=CountingSort.sortIncrease(numbers, 23);
		System.out.println(Arrays.toString(result));
	}
	
	private int[] numbers={5,2,4,3,6,7,5,1,3,5,23,5,3};
}
