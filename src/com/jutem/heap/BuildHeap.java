package com.jutem.heap;

public class BuildHeap{

	public static void BuildMaxHeap(int[] numbers){

		//��ʼ�����λ�ã��ӷ�Ҷ�ӽڵ㿪ʼ��
		int tag=numbers.length/2-1;

		for(int i=tag;i>=0;i--)
			Heapify.MaxHeapify(numbers, i);
	}

}