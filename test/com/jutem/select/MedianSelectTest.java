package com.jutem.select;

import org.junit.Test;

public class MedianSelectTest {

	@Test 
	public void MedianSelect(){
		
		int n=MedianSelect.Select(numbers,3,7,5);
		System.out.println(n);
	}
	
	private int[] numbers={1,2,3,4,5,6,7,8,9};
}
