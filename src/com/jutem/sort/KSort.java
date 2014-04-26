package com.jutem.sort;

/**
 * 
 * k-sort������
 * ���±�i��ʼ������k������ƽ����С�ڵ����±�i+1������k������ƽ����
 * 
 * �㷨ʱ�临�Ӷ�Ҫ���Ͻ磺nlg(n/k)
 */
public class KSort {
	
	/**
	 * 
	 * @param k k�����ʶ
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
