package com.jutem.select;

import com.jutem.util.Exchange;

public class RandomizedSelect {
	
	/**
	 * ���ÿ��������partition������
	 * @param numbers ��������
	 * @param p ���ݷָ���߽�
	 * @param r ���ݷָ��ұ߽�
	 * @param i ����[p,r]�����е�iС��Ԫ��
	 * ��һ��ʵ��ʵ��ΪOtherRandomizedSelectWithPartition()
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
	 * @param i ���������е�iС����
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
		//�������p-r������һ����
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
