package com.jutem.util;

/**
 * ͬʱ��ȡmax��min
 * ��3n/2�αȽ�
 */
public class MaxAndMin {

	public static int[] getMaxAndMin(int[] numbers){
		
		int min=numbers[0];
		int max=numbers[0];
		
		for(Integer n:numbers){
			
			int p=n;
			if(min>p){
				p=min;
				min=n;
			}
				

			if(p>max)
				max=n;

		}
		
		return new int[]{min,max};
	}
}
