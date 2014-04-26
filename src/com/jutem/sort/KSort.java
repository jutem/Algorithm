package com.jutem.sort;

/**
 * 
 * k-sort描述：
 * 从下标i开始的连续k个数的平均数小于等于下标i+1的连续k个数的平均数
 * 
 * 算法时间复杂度要求，上界：nlg(n/k)
 * 
 * 思路：简化k排序的定义，就是第二小题的表达式，k排序成立当且仅当numbers[n]<numbers[n+k]
 * 所以只需要对numbers[n],numbers[n+K],numbers[n+2k]……进行排序就行了
 */
public class KSort {
	
	public static void  Sort(int[] numbers){
		
	}
	
	/**
	 * 
	 * @param k k排序标识
	 * 时间复杂度上界(n^2)/k
	 * 
	 * →_→其实只要把对各个组的排序换成上界为nlgn的排序就能达到题目要求，
	 * 但是这些排序要知道整个数组才能进行排序，会比较麻烦- -而排序能边遍历
	 * 边排序写起来应该比较简单。。。
	 */
	public static void SortIncreaseInsertion(int[] numbers,int k){
			
		//将整个数组划分为k组，分别对每组进行插入排序
		for(int i=0;i<k;i++){
			
			//插入排序
			for(int j=i;j<numbers.length;j+=k){
				
				int key=numbers[j];
				int p=j-k;
				while(p>=0 && numbers[p]>key){
					
					numbers[p+k]=numbers[p];
					p-=k;
				}
				
				numbers[p+k]=key;
			}	
		}		
	}
}
