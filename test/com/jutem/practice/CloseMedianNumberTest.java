package com.jutem.practice;

import java.util.Arrays;

import org.junit.Test;

public class CloseMedianNumberTest {

	@Test
	public void searchCloseNumbersTest(){
		
		int[] result=CloseMedianNumber.searchCloseNumbers(numbers, 2);
		System.out.println(Arrays.toString(result));
	}
	
	private int[] numbers={3,4,6,1,8,7};
}
