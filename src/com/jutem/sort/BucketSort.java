package com.jutem.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class BucketSort {
	
	/**
	 * 
	 * @param numbers numbers���ݾ��ȷֲ���[0,1)������
	 */
	public static ArrayList<Double>[]  sortIncrease(Double[] numbers){
		
		ArrayList<Double>[] bucket=new ArrayList[numbers.length];
		for(int i=0;i<bucket.length;i++)
			bucket[i]=new ArrayList<Double>();
		
		//��װ������Ͱ��
		for(int i=0;i<numbers.length;i++)
			bucket[(int)(numbers[i]*bucket.length)].add(numbers[i]);
		
		//Ͱ������
		for(int i=0;i<bucket.length;i++){
			
			Object[] elementsOfSort=bucket[i].toArray();
			Arrays.sort(elementsOfSort);
			
			Double[] sorted=new Double[elementsOfSort.length];
			for(int j=0;j<elementsOfSort.length;j++)
				sorted[j]=(Double) elementsOfSort[j];
			
			bucket[i]=new ArrayList<Double>(Arrays.asList(sorted));
		}

		
		return bucket;
	}
}
