package com.jutem.practice;

import java.util.ArrayList;

import com.jutem.select.MedianSelect;
import com.jutem.select.RandomizedSelect;

/**
 * 9.3-6
 * 寻找k分位数（将集合k等分的k-1个顺序统计量）
 * 时间复杂度上界nlgk
 */
public class KthQuantile {
	
	public KthQuantile(int[] numbers,int k){
		this.numbers=numbers;
		this.k=k;
		this.groupLength=numbers.length/k;
	}
	
	/**
	 * 类似二分查找
	 * @param p	数组左边界
	 * @param r 数组右边界
	 * @param left k分位数左边界
	 * @param right k分位数右边界
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
