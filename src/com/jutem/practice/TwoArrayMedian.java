package com.jutem.practice;

/**
 * 
 * 设X[n],Y[n]两个数组已经排好序，求X,Y两个数组共2n
 * 个元素的中位数
 * 算法时间复杂度O(lgn)
 * 
 * 大致思路：因为两个数组长度均为n且已排序好，所以中位数为下标n的数据
 * 大于中位数的数也有n个。同时取出x，y的中位数进行比较，若x的中位
 * 数大于y的，说明中位数是小于等于x中位数或者大于等于y中位数的数字。（这样
 * 才能保证中位数右边为n个数据）
 */
public class TwoArrayMedian {

	public static int getMedian(int[] x,int[] y){
		
		int xl=0; //x左边界
		int xr=x.length-1; //x右边界
		int yl=0; //y左边界
		int yr=y.length-1; //y右边界
		
		
		while(true){		

			int xMedian=(xl+xr)/2;
			int yMedian=(yl+yr)/2;
			
			if(xl>=xr && yl>=yr){
				
				if(x[xMedian]<=y[yMedian])
					return x[xMedian];
				else
					return y[yMedian];
			}
			
			if(x[xMedian]==y[yMedian])
				return x[xMedian];		
			else if(x[xMedian]>y[yMedian]){
				//防止只有两个数时出现，想取右边时出现死循环
				xr=xMedian;
				if(yr-yl==1)
					yl=yMedian+1;
				else
					yl=yMedian;
			} else{		
				yr=yMedian;
				//防止只有两个数时出现，想取右边时出现死循环
				if(xr-xl==1)
					xl=xMedian+1;
				else
					xl=xMedian;
			}	
		}
	}
}
