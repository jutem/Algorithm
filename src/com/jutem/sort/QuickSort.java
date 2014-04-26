package com.jutem.sort;

import java.util.Arrays;

public class QuickSort {

	/**
	 * @param p ����±�
	 * @param r �Ҷ��±�
	 */
	public static void QuickSortIncrease(int[] numbers,int p,int r){

		if(p<r){
			int q=Partition(numbers,p,r);
			if(q-1>=0)
				QuickSortIncrease(numbers,p,q-1);
			if(q+1<numbers.length)
				QuickSortIncrease(numbers,q+1,r);
		}
	}
	
	public static void RandomQuickSortIncrease(int[] numbers,int p,int r){
		
		if(p<r){
			int q=RandomPartition(numbers,p,r);
			if(q-1>=0)
				RandomQuickSortIncrease(numbers,p,q-1);
			if(q+1<numbers.length)
				RandomQuickSortIncrease(numbers,q+1,r);
		}
	}
	
	public static void HoareQuickSortIncrease(int[] numbers,int p,int r){
			
		if(p<r){
			int q=HoarePartition(numbers,p,r);
			//����Hoare����numbers[q]Ԫ�ز����м����������numbers[q]��������
			if(q>=0)
				HoareQuickSortIncrease(numbers,p,q);
			if(q+1<numbers.length)
				HoareQuickSortIncrease(numbers,q+1,r);
		}
	}
	
	public static void ForSameNumberQuickSortIncrease(int[] numbers,int p,int r){
		
		if(p<r){
			int[] divisions=PartitionForSameNumber(numbers, p, r);
			if(divisions[0]-1>=0)
				ForSameNumberQuickSortIncrease(numbers, p, divisions[0]-1);
			if(divisions[1]+1<numbers.length)
				ForSameNumberQuickSortIncrease(numbers, divisions[1]+1, r);
		}
	}
	
	private static int Partition(int[] numbers,int p,int r){

		int i=p-1;
		for(int j=p;j<r;j++)
			if(numbers[j]<=numbers[r]){
				int temp=numbers[j];
				numbers[j]=numbers[++i];
				numbers[i]=temp;
			}
		int temp=numbers[r];
		numbers[r]=numbers[++i];
		numbers[i]=temp;

		return i;
	}
	
	/**
	 * 7-2�����ͬԪ�صĿ�������
	 * �㷨ƽ��ʱ�临�Ӷ�Ҫ��r-p
	 * 
	 * �������ηָ�ֱ����result[0],result[1]�����±�
	 * [result[0],result[1]]Ϊ���Ԫ��
	 */
	private static int[] PartitionForSameNumber(int[] numbers,int p,int r){
		
		int[] result=new int[2];
		
		int i=p-1;
		for(int j=p;j<r;j++){
			if(numbers[j]<numbers[r]){
				int temp=numbers[j];
				numbers[j]=numbers[++i];
				numbers[i]=temp;
			}
		}
		result[0]=i+1;
		
		for(int j=i+1;j<r;j++){
			if(numbers[j]==numbers[r]){
				int temp=numbers[j];
				numbers[j]=numbers[++i];
				numbers[i]=temp;
			}
		}	
		result[1]=i+1;
		
		int temp=numbers[r];
		numbers[r]=numbers[++i];
		numbers[i]=temp;

		System.out.println(Arrays.toString(numbers));
		return result;
	}
	
	private static int RandomPartition(int[] numbers,int p,int r){
		//�������p-r������һ����
		int i=(int)(Math.random()*(r-p+1))+p;
		
		int temp=numbers[r];
		numbers[r]=numbers[i];
		numbers[i]=temp;
		
		return Partition(numbers, p, r);
	}
	
	/**
	 * Hoare����
	 * @param i �����
	 * @param j �Ҳ���
	 */
	private static int HoarePartition(int[] numbers,int p,int r){
		
		int x=numbers[p];
		int i=p-1;
		int j=r+1;
		
		while(true){
			
			do{j--;}while(numbers[j]>x);
			do{i++;}while(numbers[i]<x);
			
			if(i<j){
				int temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
			}
			else
				return j;
		}
	}
}
