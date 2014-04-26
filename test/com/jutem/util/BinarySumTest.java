package com.jutem.util;

import org.junit.Test;

public class BinarySumTest
{
	@Test
	public void SumTest()
	{
		int[] a={0,0,1,1,0,1};
		int[] b={0,1,0,0,1,1};
		int[] sum1=BinarySum.Sum(a, b);
		int[] sum2=BinarySum.SumOptimize(a, b);

		for(int i=sum1.length-1;i>=0;i--)
			System.out.print(sum1[i]);

		System.out.println("");

		for(int i=sum2.length-1;i>=0;i--)
			System.out.print(sum2[i]);
	}
}
