package com.jutem.heap;

public class BuildHeap{

	public static void BuildMaxHeap(int[] numbers){

		//开始排序的位置（从非叶子节点开始）
		int tag=numbers.length/2-1;

		for(int i=tag;i>=0;i--)
			Heapify.MaxHeapify(numbers, i);
	}

}