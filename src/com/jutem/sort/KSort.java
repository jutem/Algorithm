package com.jutem.sort;

/**
 * 
 * k-sort描述：
 * 从下标i开始的连续k个数的平均数小于等于下标i+1的连续k个数的平均数
 * 
 * 算法时间复杂度要求，上界：nlg(n/k)
 */
public class KSort {
	
	/**
	 * 
	 * @param k k排序标识
	 */
	public void SortIncrease(int[] numbers,int k){
		
		int length=numbers.length/k;
		int[] a=new int[length+1];
		int[] b=new int[length+1];
		int[] c=new int[length];
		
		for(int i=0,j=0;i<numbers.length;i+=k,j++)
			a[j]=numbers[i];
		for(int i=1,j=0;i<numbers.length;i+=k,j++)
			b[j]=numbers[i];
		for(int i=2,j=0;i<numbers.length;i+=k,j++)
			c[j]=numbers[i];
			
		MergeSort.Sort(a, 0, r);
			
	}
}
