package com.jutem.heap;

public class Heapify {

	public static void MaxHeapify(int[] numbers,int tag){
		int left=tag*2+1;
		int right=tag*2+2;
		int largest=tag;

		if(left<numbers.length && numbers[left]>numbers[largest])
			largest=left;
		if(right<numbers.length && numbers[right]>numbers[largest])
			largest=right;

		if(largest!=tag){
			int temp=numbers[tag];
			numbers[tag]=numbers[largest];
			numbers[largest]=temp;
			MaxHeapify(numbers,largest);
		}
	}

	//²»ÓÃµİ¹é
	public static void MaxHeapifyWithoutRecursion(int[] numbers,int tag){
		int largest=tag;
		while(true){
			int left=tag*2+1;
			int right=tag*2+2;

			if(left<numbers.length && numbers[left]>numbers[largest])
				largest=left;
			if(right<numbers.length && numbers[right]>numbers[largest])
				largest=right;

			if(largest!=tag){

				int temp=numbers[tag];
				numbers[tag]=numbers[largest];
				numbers[largest]=temp;

				tag=largest;
			}
			else
				break;
		}
	}
}
