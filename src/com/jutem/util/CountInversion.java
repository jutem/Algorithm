package com.jutem.util;


/**
 * 统计逆序对数量
 */
public class CountInversion
{
	public static void CountInversionUseMerge(int[] numbers,int p,int r)
	{
		if(p<r)
		{
			int q=(p+r)/2;
			CountInversionUseMerge(numbers,p,q);
			CountInversionUseMerge(numbers,q+1,r);
			MergeCount(numbers,p,q,r);
		}
	}

	private static void MergeCount(int[] numbers,int p,int q,int r)
	{
		int n1=q-p+1;
		int n2=r-q;

		int rightCount=0; //右边牌堆已经排序的牌

		int[] left=new int[n1+1];
		int[] right=new int[n2+1];

		for(int i=0;i<n1;i++)
			left[i]=numbers[p+i];
		for(int i=0;i<n2;i++)
			right[i]=numbers[q+i+1];

		left[n1]=Integer.MAX_VALUE;
		right[n2]=Integer.MAX_VALUE;

		int i=0;
		int j=0;

		for(int k=p;k<=r;k++)
		{
			if(left[i]<=right[j])
			{
				numbers[k]=left[i];
				i++;

				count+=rightCount;
			}
			else
			{
				numbers[k]=right[j];
				j++;

				rightCount++;
			}
		}
	}

	/*get()*/
	public static int getCount() {
		return count;
	}

	private static int count=0;


}
