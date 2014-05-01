package com.jutem.select;

import org.junit.Test;

public class RandomizedSelectTest {

	@Test
	public void RandomizedSelectWithPartitionTest(){
		
		int n=RandomizedSelect.RandomizedSelectWithPartition(numbers, 0, numbers.length-1, 1);
		System.out.println(n);
	}
	
	@Test
	public void OtherRandomizedSelectWithPartitionTest(){
		 
		int n=RandomizedSelect.OtherRandomizedSelectWithPartition(numbers, 0, numbers.length-1, 1);
		System.out.println(n);
	}
		
	int[] numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
}
