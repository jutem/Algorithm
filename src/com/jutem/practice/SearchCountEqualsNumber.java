package com.jutem.practice;

/**
 *�㷨���۵�����2.3-7
 *����һ������ʱ��Ϊnlgn���㷨������n�������ļ���S����һ������x�����㷨��ȷ��S���Ƿ����������͸պõ���x
 *��Ԫ��
 */
public class SearchCountEqualsNumber
{
	// ����ʱ�úϲ������С��������
	public static void SearchForPlus(int[] numbers,int x,int left,int right)
	{
		if(left==right)
			System.out.println("δ�ҵ�ƥ����Ŀ");
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
