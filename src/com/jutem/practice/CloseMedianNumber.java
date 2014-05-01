package com.jutem.practice;

import com.jutem.select.RandomizedSelect;
import com.jutem.util.Exchange;

/**
 * 9.3-7
 * ����һ��O(n)�㷨���ڸ���n����ͬ���ֵļ���S
 * �Լ�һ��������k<=n������ȷ����S����ӽ�����λ����
 * k����
 */
public class CloseMedianNumber {
	
	public static int[] searchCloseNumbers(int[] numbers,int k){
		
		int index=(numbers.length+1)/2;//��λ��λ��
		int[] distance=new int[numbers.length];//�����������������λ���ľ���
		
		int median=RandomizedSelect.RandomizedSelectWithPartition(numbers, 0, numbers.length-1, index);
		
		for(int i=0;i<numbers.length;i++){
			if(i==index-1)
				distance[i]=Integer.MAX_VALUE;
			else
				distance[i]=Math.abs(numbers[i]-median);
		}
		
		int[][] store=new int[2][];//�����洢���ݺ;�����Ϣ
		store[0]=distance;
		store[1]=numbers;
				
		DemensionSelect(store,0,store[0].length-1,k);
		
		int[] result=new int[k];
		System.arraycopy(store[1], 0, result, 0, k);
		
		return result;
	}
	
	private static boolean DemensionSelect(int[][] n,int p,int r,int i){
					
			if(p==r)
				return true;
			int q=keyPartition(n,p,r);
			
			int k=q-p+1;
			if(k==i)
				return true;
			else if(k>i && q-1>=0)
				return DemensionSelect(n, p, q-1, i);
			else if(k<i && q+1<n[0].length)
				return DemensionSelect(n, q+1, r, i-k);
			else
				return false;
		}
	
	private static int keyPartition(int[][] n,int p,int r){
		
		int i=p-1;
		for(int j=p;j<r;j++){
			
			if(n[0][j]<=n[0][r]){
				
				Exchange.exchange(n[0], j, ++i);
				Exchange.exchange(n[1], j, i);
			}
		}
		
		Exchange.exchange(n[0], ++i, r);
		Exchange.exchange(n[1], i, r);
		
		return i;
	}
}
