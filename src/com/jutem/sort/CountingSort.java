package com.jutem.sort;


public class CountingSort {
	
	/**
	 * @param k 数据范围从0-k
	 */
	public static int[] sortIncrease(int[] numbers,int k){
		
		int[] coutArray=new int[k+1];
		for(int i=0;i<numbers.length;i++)
			coutArray[numbers[i]]++;
		
		//计算这个数之前还有多少个数（包括该数）
		for(int i=1;i<coutArray.length;i++)
			coutArray[i]+=coutArray[i-1];
		
		int[] result=new int[numbers.length];
		
		//反向放入保证新生成的数组是稳定的
		for(int i=numbers.length-1;i>=0;i--){
			
			result[coutArray[numbers[i]]-1]=numbers[i];
			coutArray[numbers[i]]--;
		}
		
		return result;
	}
}
