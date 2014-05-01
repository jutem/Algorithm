package com.jutem.select;

import com.jutem.sort.InsertionSort;
import com.jutem.util.Exchange;

public class MedianSelect {

	/**
	 * 
	 * @param i ��iС����
	 */
	public static int Select(int[] numbers,int p,int r,int i){
			
		if(p==r)
			return numbers[p];
		int q=MedianPartition(numbers,p,r);
		
		if(q==i-1)
			return numbers[q];
		else if(q>i-1 && q-1>=0)
			return Select(numbers, p, q-1, i);
		else if(q<i-1 && q+1<numbers.length)
			return Select(numbers, q+1, r, i);
		else
			return 0;
	}
	
	/**
	 * ����9.3��������ʱ���ѡ��
	 * ͨ������Ѱ����λ����ѯ
	 * 
	 * ����������һ�㷨��������һ��㲻��⣬����3��ʾ��Ҫ�ݹ����select�ҳ���λ��X��
	 * ���ǵݹ���õõ��Ĳ�һ������λ������λ��
	 */
	private static int getMedian(int[] orignNumbers,int p,int r){
		
		int[] numbers=new int[r-p+1];
		System.arraycopy(orignNumbers, p, numbers, 0, numbers.length);
		int n=numbers.length % 5; //���һ������
		int numbersOfGroup=0; //����	
		int[][] group;
		if(n==0){
			numbersOfGroup=numbers.length/5; 
			group=new int[numbersOfGroup][5];
			//��ʼ������
			for(int k=0,j=0;k<group.length;k++,j+=5)
				System.arraycopy(numbers, j, group[k], 0, 5);
		}
		else{
			numbersOfGroup=numbers.length/5+1;
			group=new int[numbersOfGroup][5]; 	
			group[numbersOfGroup-1]=new int[n];
			
			//��ʼ������
			for(int k=0,j=0;k<group.length-1;k++,j+=5)
				System.arraycopy(numbers, j, group[k], 0, 5);
			//��ʼ�����һ������
			System.arraycopy(numbers, numbers.length-n, group[numbersOfGroup-1], 0, n);
		}
					
		for(int j=0;j<group.length;j++)
			InsertionSort.SortIncrease(group[j]);
				
		int[] medians=new int[numbersOfGroup]; //��λ��
		
		//����λ���ŵ�medians
		for(int i=0;i<medians.length-1;i++)
			medians[i]=group[i][2];	
		//�����һ����λ���ŵ�medians
		if(n==0)
			medians[medians.length-1]=group[numbersOfGroup-1][2];
		else
			medians[medians.length-1]=group[numbersOfGroup-1][(n-1)/2];
		
		InsertionSort.SortIncrease(medians);		
		return medians[(medians.length-1)/2];

	}
	
	private static int MedianPartition(int[] numbers,int p,int r){		
		//�õ�����ֵ
		int n=getMedian(numbers,p,r);
		
		return Partition(numbers,p,r,n);
	}
	
	private static int Partition(int[] numbers,int p,int r,int median){
		
		int i=p-1;
		for(int j=p;j<=r;j++){
			if(numbers[j]<median)
				Exchange.exchange(numbers, j, ++i);
			if(numbers[j]==median)
				Exchange.exchange(numbers, j, r);
		}
		
		Exchange.exchange(numbers, r, ++i);
		
		return i;
	}
}
