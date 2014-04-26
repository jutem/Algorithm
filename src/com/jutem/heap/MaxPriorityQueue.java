package com.jutem.heap;

import java.util.Arrays;

public class MaxPriorityQueue {

	public static int Maximum(int[] numbers){
		return numbers[0];
	}

	public static int HeapExtractMax(int[] numbers){

		int heapSize=0;
		for(;heapSize<numbers.length;heapSize++)
			if(numbers[heapSize]==Integer.MIN_VALUE)
				break;

		//判断堆中是否已经没有数据
		if(heapSize==0)
			return Integer.MIN_VALUE;
		else{
			int max=numbers[0];
			numbers[0]=numbers[heapSize-1];
			numbers[heapSize-1]=Integer.MIN_VALUE;
			Heapify.MaxHeapify(numbers, 0);
			return max;
		}
	}

	public static void HeapIncreaseKey(int[] numbers,int index,int key){

		if(key<numbers[index]){
			System.out.println("key小于当前值");
			return;
		}

		numbers[index]=key;

		//(index-1)/2=index-1>>>1(位移操作)
		while(index>0 && numbers[index-1>>>1]<numbers[index]){

			int temp=numbers[index];
			numbers[index]=numbers[index-1>>>1];
			numbers[index-1>>>1]=temp;


			index=index-1>>>1;
		}
	}

	public static int[] Insert(int[] numbers,int n){

		int[] insertedNumbers=Arrays.copyOf(numbers, numbers.length+1);
		//为了避开HeapIncreaseKey中判断新值必须大于原来的值
		insertedNumbers[insertedNumbers.length-1]=Integer.MIN_VALUE;

		HeapIncreaseKey(insertedNumbers, insertedNumbers.length-1, n);

		return insertedNumbers;
	}
	
	//模仿HeapExtractMax
	public static int[] Delete(int [] numbers,int i){
		
		if(numbers.length==1)
			return null;
		
		numbers[i]=numbers[numbers.length-1];
		numbers[numbers.length-1]=Integer.MIN_VALUE;
		Heapify.MaxHeapify(numbers, i);
			
		int[] result=new int[numbers.length-1];
		System.arraycopy(numbers, 0, result, 0, numbers.length-1);
		return result;
	}

}
