package com.jutem.select;

import com.jutem.util.Exchange;

public class RandomizedSelect {
	
	/**
	 * 利用快速排序的partition来查找
	 * @param numbers 数据数组
	 * @param p 数据分割左边界
	 * @param r 数据分割右边界
	 * @param i 查找[p,r]区间中第i小的元素
	 * 另一种实现实现为OtherRandomizedSelectWithPartition()
	 */
	public static int RandomizedSelectWithPartition(int[] numbers,int p,int r,int i){
		
		if(p==r)
			return numbers[p];
		int q=RandomPartition(numbers,p,r);
		
		int k=q-p+1;
		if(k==i)
			return numbers[q];
		else if(k>i && q-1>=0)
			return RandomizedSelectWithPartition(numbers, p, q-1, i);
		else if(k<i && q+1<numbers.length)
			return RandomizedSelectWithPartition(numbers, q+1, r, i-k);
		else
			return 0;
	}
	
	/**
	 * 
	 * @param i 整个数组中第i小的数
	 */
	public static int OtherRandomizedSelectWithPartition(int[] numbers,int p,int r,int i){
		
		if(p==r)
			return numbers[p];
		int q=RandomPartition(numbers,p,r);
		
		if(q==i-1)
			return numbers[q];
		else if(q>i-1 && q-1>=0)
			return OtherRandomizedSelectWithPartition(numbers, p, q-1, i);
		else if(q<i-1 && q+1<numbers.length)
			return OtherRandomizedSelectWithPartition(numbers, q+1, r, i);
		else
			return 0;
	}
	
	private static int RandomPartition(int[] numbers,int p,int r){
		//随机产生p-r中任意一个数
		int i=(int)(Math.random()*(r-p+1))+p;
		
		Exchange.exchange(numbers, r, i);
		
		return Partition(numbers, p, r);
	}
	
	private static int Partition(int[] numbers,int p,int r){

		int i=p-1;
		for(int j=p;j<r;j++)
			if(numbers[j]<=numbers[r])
				Exchange.exchange(numbers, j, ++i);

		Exchange.exchange(numbers, r, ++i);

		return i;
	}
}
