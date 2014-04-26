package com.jutem.heap;

import java.util.Arrays;

import org.junit.Test;

public class HeapSortTest {
	@Test
	public void HeapSortIncrease(){

		int[] result=HeapSort.HeapSortIncrease(numbers);

		System.out.println(Arrays.toString(result));
	}

	private int[] numbers={10,4,7,6,3,2,1,5};
}
