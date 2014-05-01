package com.jutem.select;

import com.jutem.sort.InsertionSort;
import com.jutem.util.Exchange;

public class MedianSelect {

	/**
	 * 
	 * @param i 第i小的数
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
	 * 正文9.3最坏情况线性时间的选择
	 * 通过分组寻找中位数查询
	 * 
	 * 对于书中这一算法的描述有一点点不理解，步骤3表示需要递归调用select找出中位数X，
	 * 但是递归调用得到的不一定是中位数的中位数
	 */
	private static int getMedian(int[] orignNumbers,int p,int r){
		
		int[] numbers=new int[r-p+1];
		System.arraycopy(orignNumbers, p, numbers, 0, numbers.length);
		int n=numbers.length % 5; //最后一组数量
		int numbersOfGroup=0; //组数	
		int[][] group;
		if(n==0){
			numbersOfGroup=numbers.length/5; 
			group=new int[numbersOfGroup][5];
			//初始化分组
			for(int k=0,j=0;k<group.length;k++,j+=5)
				System.arraycopy(numbers, j, group[k], 0, 5);
		}
		else{
			numbersOfGroup=numbers.length/5+1;
			group=new int[numbersOfGroup][5]; 	
			group[numbersOfGroup-1]=new int[n];
			
			//初始化分组
			for(int k=0,j=0;k<group.length-1;k++,j+=5)
				System.arraycopy(numbers, j, group[k], 0, 5);
			//初始化最后一组数据
			System.arraycopy(numbers, numbers.length-n, group[numbersOfGroup-1], 0, n);
		}
					
		for(int j=0;j<group.length;j++)
			InsertionSort.SortIncrease(group[j]);
				
		int[] medians=new int[numbersOfGroup]; //中位数
		
		//将中位数放到medians
		for(int i=0;i<medians.length-1;i++)
			medians[i]=group[i][2];	
		//将最后一个中位数放到medians
		if(n==0)
			medians[medians.length-1]=group[numbersOfGroup-1][2];
		else
			medians[medians.length-1]=group[numbersOfGroup-1][(n-1)/2];
		
		InsertionSort.SortIncrease(medians);		
		return medians[(medians.length-1)/2];

	}
	
	private static int MedianPartition(int[] numbers,int p,int r){		
		//得到的是值
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
