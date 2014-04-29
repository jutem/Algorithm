package com.jutem.practice;

import java.awt.Point;
import java.util.Arrays;

import com.jutem.select.RandomizedSelect;

/**
 * 
 * 9.3-9
 * ��˾׼������һ��������Ĵ��͹ܵ���������n���;���������;��������ܵ�
 * �����·�������ܵ�ֱ�����ӣ����ϻ򱱣������������;����꣬x��y��Ӧ���ѡ��
 * ���ܵ�������λ�ã�ʹ�ø���ܳ����ܺ���С��λ�ã���֤������������ʱ����ȷ����
 * 
 * ˼·��
 * ��ʵ����ܵ���λ�þ��Ǵ���y���꼯�ϵ���λ�����ڵ�λ�á�
 * ��Ϊ�������;��䣬�������ĸ�λ������·���ĺ����ǲ���ġ�
 * λ�õĲ���ȡ���ڶ������һ���;���
 * ���Ե�nΪż��������������λ������λ�ö����ԣ�nΪ��������ܵ�ͨ����λ��
 */
public class OilPipeline {

	public OilPipeline(){
		
		for(int i=0;i<points.length;i++){
			
			points[i]=new Point();
			points[i].setLocation((int)(Math.random()*10+1), (int)(Math.random()*10+1));
		}
			
	}
	
	public void BuildPipeline(){
		
		int[] ySet=new int[points.length];
		for(int i=0;i<points.length;i++)
			ySet[i]=points[i].y;
		
		int i=0;
		if(ySet.length%2==0)
			i=ySet.length/2-1;
		else
			i=ySet.length/2;
		int n=RandomizedSelect.MedianSelect(ySet, 0, ySet.length-1, i);
		System.out.println(Arrays.toString(points));
		System.out.println("������y="+n);
	}
	
	private Point[] points=new Point[10];
}
