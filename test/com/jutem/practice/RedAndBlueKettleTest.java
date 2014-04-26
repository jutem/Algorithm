package com.jutem.practice;

import java.util.Arrays;

import org.junit.Test;

public class RedAndBlueKettleTest {

	@Test
	public void StartWithRed(){
		
		RedAndBlueKettle rb=new RedAndBlueKettle(redKettles,blueKettles);
		rb.StartWithRed(0, redKettles.length-1, blueKettles[0]);
		System.out.println(Arrays.toString(redKettles));
		System.out.println(Arrays.toString(blueKettles));
	}
	
	private int[] redKettles={1,3,7,4,5,2,6};
	private int[] blueKettles={5,2,7,1,4,3,6};
	
}
