package com.jutem.heap;

import java.util.Arrays;

import org.junit.Test;

public class BuildHeapTest {

	@Test
	public void BuildMaxHeapTest()
	{
		BuildHeap.BuildMaxHeap(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private int[] numbers={5,10,7,3,6,1,4,2};
}
