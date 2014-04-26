package com.jutem.heap;

public class HeapSort {

	public static int[] HeapSortIncrease(int[] numbers){

		BuildHeap.BuildMaxHeap(numbers);
		int heap_size=numbers.length;

		int[] result=new int[numbers.length];

		for(int i=0;i<numbers.length;i++)
		{
			result[heap_size-1]=numbers[0];
			numbers[0]=Integer.MIN_VALUE;
			heap_size-=1;

			Heapify.MaxHeapify(numbers, 0);
		}

		return result;
	}
}
