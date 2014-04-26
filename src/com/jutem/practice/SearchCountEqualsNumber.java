package com.jutem.practice;

/**
 *算法导论第三版2.3-7
 *描述一个运行时间为nlgn的算法，给定n个整数的集合S和另一个整数x，该算法能确定S中是否存在两个其和刚好等于x
 *的元素
 */
public class SearchCountEqualsNumber
{
	// 测试时用合并排序从小到大排列
	public static void SearchForPlus(int[] numbers,int x,int left,int right)
	{
		if(left==right)
			System.out.println("未找到匹配项目");
		else
		{
			int sum=numbers[left]+numbers[right];

			if(sum==x)
			{
				System.out.println(left+" "+right);
				return;
			}
			if(sum>x)
				right--;
			if(sum<x)
				left++;
			SearchForPlus(numbers,x,left,right);
		}
	}
}
