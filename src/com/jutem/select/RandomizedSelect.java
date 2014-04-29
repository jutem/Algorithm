package com.jutem.select;

import com.jutem.sort.InsertionSort;
import com.jutem.util.Exchange;

public class RandomizedSelect {
	
	/**
	 * ���ÿ��������partition������
	 * @param numbers ��������
	 * @param p ���ݷָ���߽�
	 * @param r ���ݷָ��ұ߽�
	 * @param i ����[p,r]�����е�kС��Ԫ��
	 * ��i���ΪҪ��ѯ�������±�+1����򵥣�ʵ��ΪOtherRandomizedSelectWithPartition()
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
	 * @param i Ϊ����ѯ�������±�+1
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
	
	public static int MedianSelect(int[] numbers,int p,int r,int i){
			
		if(p==r)
			return numbers[p];
		int q=MedianPartion(numbers,p,r);
		
		if(q==i-1)
			return numbers[q];
		else if(q>i-1 && q-1>=0)
			return OtherRandomizedSelectWithPartition(numbers, p, q-1, i);
		else if(q<i-1 && q+1<numbers.length)
			return OtherRandomizedSelectWithPartition(numbers, q+1, r, i);
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
	private static int getMedian(int[] numbers){
		
		int n=numbers.length % 5; //���һ������
		int numbersOfGroup=0; //����	
		int[][] group;
		if(n==0){
			numbersOfGroup=numbers.length/5; 
			group=new int[numbersOfGroup][5];
			//��ʼ������
			for(int k=0,j=0;k<group.length-1;k++,j+=5)
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
		for(int i=0;i<medians.length-1;i++)
			medians[i]=group[i][2];
		
		if(n!=0){
			if(n%2==0)
				medians[medians.length-1]=group[numbersOfGroup-1][(n-1)/2];
			else
				medians[medians.length-1]=group[numbersOfGroup-1][(n-1)/2+1];
		}
	
		InsertionSort.SortIncrease(medians);
		if(medians.length%2==0)
			return medians[(n-1)/2];
		else
			return medians[(n-1)/2+1];

	}
	
	private static int MedianPartion(int[]numbers,int p,int r){
		
		int i=getMedian(numbers);
		
		Exchange.exchange(numbers, r, i);
		
		return Partition(numbers,p,r);
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
