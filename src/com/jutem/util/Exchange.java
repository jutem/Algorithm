package com.jutem.util;

public class Exchange {

	public static void exchange(int[] numbers,int i,int j){
		
		int temp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
	}
}
