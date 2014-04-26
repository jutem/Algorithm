package com.jutem.sort;

public class MergeSort
{
	public static void Sort(int[] numbers,int p,int r)
	{
		if(p<r)
		{
			int q=(p+r)/2;
			Sort(numbers,p,q);
			Sort(numbers,q+1,r);
			Merge(numbers,p,q,r);
		}
	}

	public static void SortWithoutSentinel(int[] numbers,int p,int r)
	{
		if(p<r)
		{
			int q=(p+r)/2;
			Sort(numbers,p,q);
			Sort(numbers,q+1,r);
			MergeWithoutSentinel(numbers,p,q,r);
		}
	}

	private static void Merge(int[] numbers,int p,int q,int r)
	{
		int n1=q-p+1;
		int n2=r-q;

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
			}
			else
			{
				numbers[k]=right[j];
				j++;
			}
		}
	}

	private static void MergeWithoutSentinel(int[] numbers,int p,int q,int r)
	{
		int n1=q-p+1;
		int n2=r-q;

		int[] left=new int[n1];
		int[] right=new int[n2];

		for(int i=0;i<n1;i++)
			left[i]=numbers[p+i];
		for(int i=0;i<n2;i++)
			right[i]=numbers[q+i+1];

		int i=0;
		int j=0;

		for(int k=p;k<=r;k++)
		{
			if(i==n1)
			{
				for(;k<=r;k++)
				{
					numbers[k]=right[j];
					j++;
				}
				break;
			}
			if(j==n2)
			{
				for(;k<=r;k++)
				{
					numbers[k]=left[i];
					i++;
				}
				break;
			}

			if(left[i]<=right[j])
			{
				numbers[k]=left[i];
				i++;
			}
			else
			{
				numbers[k]=right[j];
				j++;
			}
		}
	}
}
