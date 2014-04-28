package com.jutem.heap;

import com.jutem.util.Exchange;

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
			Exchange.exchange(numbers, tag, largest);
			MaxHeapify(numbers,largest);
		}
	}

	//≤ª”√µ›πÈ
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
				Exchange.exchange(numbers, tag, largest);
				tag=largest;
			}
			else
				break;
		}
	}
}
