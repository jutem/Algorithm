package com.jutem.sort;


public class CountingSort {
	
	/**
	 * @param k ���ݷ�Χ��0-k
	 */
	public static int[] sortIncrease(int[] numbers,int k){
		
		int[] coutArray=new int[k+1];
		for(int i=0;i<numbers.length;i++)
			coutArray[numbers[i]]++;
		
		//���������֮ǰ���ж��ٸ���������������
		for(int i=1;i<coutArray.length;i++)
			coutArray[i]+=coutArray[i-1];
		
		int[] result=new int[numbers.length];
		
		//������뱣֤�����ɵ��������ȶ���
		for(int i=numbers.length-1;i>=0;i--){
			
			result[coutArray[numbers[i]]-1]=numbers[i];
			coutArray[numbers[i]]--;
		}
		
		return result;
	}
}
