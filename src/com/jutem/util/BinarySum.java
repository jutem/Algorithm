package com.jutem.util;

/**
 * 二进制数字相加
 */
public class BinarySum
{
	//a.length=b.length
	public static int[] Sum(int[] a,int[] b)
	{
		boolean isCarry=false;
		int[] sum=new int[a.length+1];
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]+" "+b[i]);
			if(isCarry)
				sum[i]=a[i]+b[i]+1;
			else
				sum[i]=a[i]+b[i];
			//System.out.println(sum[i]);

			switch(sum[i])
			{
			case 0:;
			case 1:isCarry=false;break;
			case 2:sum[i]=0;isCarry=true;break;
			case 3:sum[i]=1;isCarry=true;break;
			default:break;
			}
		}
		sum[a.length]=1;
		return sum;
	}

	public static int [] SumOptimize(int[] a,int[] b)
	{
		int flag=0;
		int[] sum=new int[a.length+1];

		for(int i=0;i<a.length;i++)
		{
			int key=a[i]+b[i]+flag;
			sum[i]=key % 2;
			if(key>1)
				flag=1;
		}
		sum[a.length]=flag;
		return sum;
	}
}
