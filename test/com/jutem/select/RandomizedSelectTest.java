package com.jutem.select;

import org.junit.Test;

public class RandomizedSelectTest {

	@Test
	public void RandomizedSelectWithPartitionTest(){
		
		int n=RandomizedSelect.RandomizedSelectWithPartition(numbers, 0, numbers.length-1, 2);
		System.out.println(n);
	}
	
	int[] numbers={5,2,4,6,1,3,9};
}
