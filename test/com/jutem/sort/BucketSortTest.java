package com.jutem.sort;

import java.util.Arrays;

import org.junit.Test;

public class BucketSortTest {

	@Test
	public void sortIncreaseTest(){
		
		System.out.println(Arrays.toString(BucketSort.sortIncrease(numbers)));
	}
	
	private Double[] numbers={0.78,0.17,0.39,0.26,0.72,0.94,0.21,0.12,
			0.23,0.68};
}
