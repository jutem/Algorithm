package com.jutem.select;

import org.junit.Test;

public class RandomizedSelectTest {

	@Test
	public void RandomizedSelectWithPartitionTest(){
		
		int n=RandomizedSelect.RandomizedSelectWithPartition(numbers, 3, numbers.length-1, 1);
		System.out.println(n);
	}
	
	@Test
	public void OtherRandomizedSelectWithPartitionTest(){
		 
		int n=RandomizedSelect.OtherRandomizedSelectWithPartition(numbers, 0, numbers.length-1, 7);
		System.out.println(n);
	}
	
	@Test 
	public void MedianSelect(){
		
		int n=RandomizedSelect.MedianSelect(numbers,5,14,10);
		System.out.println(n);
	}
	
	@Test 
	public void getMedianTest(){
		
		int median=RandomizedSelect.getMedian(orignNumbers, 5, 14);
		System.out.println(median);
	}
	
	
	
	int[] numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	
	int[] orignNumbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
}
