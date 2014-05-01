package com.jutem.practice;

import java.util.Arrays;

import org.junit.Test;

public class KthQuantileTest {

	@Test
	public void findKthQuanTileTest(){

		KthQuantile kq=new KthQuantile(numbers,k);
		kq.findKthQuanTile(0, numbers.length-1, 1, k-1);
		
		System.out.println(Arrays.toString(kq.getResult().toArray()));
	}
	
	private int[] numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	private int k=5;
}
