package com.jutem.select;

import org.junit.Test;

public class RandomizedSelectTest {

	@Test
	public void RandomizedSelectWithPartitionTest(){
		
		int n=RandomizedSelect.RandomizedSelectWithPartition(numbers, 0, numbers.length-1, 6);
		System.out.println(n);
	}
	
	@Test
	public void OtherRandomizedSelectWithPartitionTest(){
		 
		int n=RandomizedSelect.OtherRandomizedSelectWithPartition(numbers, 0, numbers.length-1, 7);
		System.out.println(n);
	}
	
	@Test 
	public void MedianSelect(){
		
		int n=RandomizedSelect.MedianSelect(numbers,0,numbers.length-1,6);
		System.out.println(n);
	}
	
	int[] numbers={5,2,4,6,1,3,9};
}
