package com.jutem.practice;

import java.util.ArrayList;

import com.jutem.select.MedianSelect;
import com.jutem.select.RandomizedSelect;

/**
 * 9.3-6
 * Ѱ��k��λ����������k�ȷֵ�k-1��˳��ͳ������
 * ʱ�临�Ӷ��Ͻ�nlgk
 */
public class KthQuantile {
	
	public KthQuantile(int[] numbers,int k){
		this.numbers=numbers;
		this.k=k;
		this.groupLength=numbers.length/k;
	}
	
	/**
	 * ���ƶ��ֲ���
	 * @param p	������߽�
	 * @param r �����ұ߽�
	 * @param left k��λ����߽�
	 * @param right k��λ���ұ߽�
	 */
	public void findKthQuanTile(int p,int r,int left,int right){

		if(left>right)
			return ;
		
		int i=(left+right)/2*groupLength;
		int n=MedianSelect.Select(numbers, p, r, i);
		result.add((Integer)n);
		
		findKthQuanTile(p,i-2,left,(left+right)/2-1);
		findKthQuanTile(i,r,(left+right)/2+1,right);
	}
	
	public ArrayList<Integer> getResult() {
		return result;
	}

	private ArrayList<Integer> result=new ArrayList();
	private int k;
	private int groupLength;
	private int[] numbers;
}
