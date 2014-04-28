package com.jutem.util;

import java.util.Arrays;

import org.junit.Test;

public class MaxAndMinTest {

	@Test
	public void getMaxAndMinTest(){
		
		int[] result=MaxAndMin.getMaxAndMin(numbers);
		System.out.println(Arrays.toString(result));
		
	}
	
	private int[] numbers={5,2,4,6,1,3};
}
