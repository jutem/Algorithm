package com.jutem.sort;

/**
 * 
 * k-sort������
 * ���±�i��ʼ������k������ƽ����С�ڵ����±�i+1������k������ƽ����
 * 
 * �㷨ʱ�临�Ӷ�Ҫ���Ͻ磺nlg(n/k)
 * 
 * ˼·����k����Ķ��壬���ǵڶ�С��ı��ʽ��k����������ҽ���numbers[n]<numbers[n+k]
 * ����ֻ��Ҫ��numbers[n],numbers[n+K],numbers[n+2k]�����������������
 */
public class KSort {
	
	public static void  Sort(int[] numbers){
		
	}
	
	/**
	 * 
	 * @param k k�����ʶ
	 * ʱ�临�Ӷ��Ͻ�(n^2)/k
	 * 
	 * ��_����ʵֻҪ�ѶԸ���������򻻳��Ͻ�Ϊnlgn��������ܴﵽ��ĿҪ��
	 * ������Щ����Ҫ֪������������ܽ������򣬻�Ƚ��鷳- -�������ܱ߱���
	 * ������д����Ӧ�ñȽϼ򵥡�����
	 */
	public static void SortIncreaseInsertion(int[] numbers,int k){
			
		//���������黮��Ϊk�飬�ֱ��ÿ����в�������
		for(int i=0;i<k;i++){
			
			//��������
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
