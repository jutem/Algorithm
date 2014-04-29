package com.jutem.practice;

import java.awt.Point;
import java.util.Arrays;

import com.jutem.select.RandomizedSelect;

/**
 * 
 * 9.3-9
 * 公司准备建造一条东西向的大型管道，穿过有n口油井的油田。从油井出发到管道
 * 沿最短路径与主管道直接连接（或南或北）。给定各口油井坐标，x，y，应如何选择
 * 主管道的最优位置（使得各喷管长度总和最小的位置），证明可以在线性时间内确定。
 * 
 * 思路：
 * 其实铺设管道的位置就是穿过y坐标集合的中位数所在的位置。
 * 因为在两个油井间，无论在哪个位置两条路径的和总是不变的。
 * 位置的差异取决于多余的那一口油井。
 * 所以当n为偶数，既在上下中位数任意位置都可以，n为奇数，则管道通过中位数
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
		System.out.println("铺设在y="+n);
	}
	
	private Point[] points=new Point[10];
}
