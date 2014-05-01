package com.jutem.practice;

import org.junit.Test;

public class TwoArrayMedianTest {

	@Test
	public void getMedianTest(){
		
		int median=TwoArrayMedian.getMedian(a, b);
		System.out.println(median);
	}
	
	private int[] a={1,3,5,7,9};
	private int[] b={2,4,6,8,10};
}
