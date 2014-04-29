package com.jutem.practice;

import com.jutem.util.Exchange;


/**
 * 
 * @author jutem
 * 题目描述：
 * 假设给定n个红色水壶和n个蓝色水壶，红色水壶中水量都不同，蓝色也一样。此外，对于每一个红色
 * 水壶都有一个与之水量相等的蓝色水壶。
 * 我们需要找出水量相等的红蓝水壶。为了打到这一目的，可以如下操作：挑选一对水壶（一红一栏），
 * 将水注满红色水壶，然后倒入蓝色水壶，通过这一操作能判断哪只水壶中的水多，或者一样，这样一个
 * 操作需要一个单位时间。目标是找出一个算法，通过最少次数比较，确定分组和配对问题。
 * 问题：
 * 1.给出一个确定型的算法，完成水壶配对，算法平均时间复杂度n^2
 * 2.证明:必须执行的比较次数下界为nlgn
 * 3.给出一个随机化算法，期望的比较次数上界为nlgn，并证明这个界是正确的。对于你的算法，最坏
 * 情况下的比较次数是什么
 * 
 * 思路：
 * 根据题意两组水壶排好序自然就找好对了
 * 运用快速排序。根据红色水壶分割蓝色水壶，同理可以分割红色水壶
 */
public class RedAndBlueKettle {
	
	public RedAndBlueKettle(int[] redKettles,int[] blueKettles){
		
		this.redKettles=redKettles;
		this.blueKettles=blueKettles;
	}
	/**
	 * 
	 * @param kettles 待分割的水壶组
	 * @param kettle 用来分割的水壶
	 * 
	 * 用蓝色水壶分割红色水壶后，将得到与蓝色水壶相等水量的红色水壶用来分割蓝色水壶
	 */
	public void StartWithRed(int p,int r,int blueKettle){
		if(p<r){
			
			int q=Partition(redKettles, p, r, blueKettle); 
			Partition(blueKettles,p,r,redKettles[q]);
			
			if(q-1>=0)
				StartWithRed(p,q-1,blueKettles[q-1]);
			if(q+1<redKettles.length)
				StartWithRed(q+1,r,blueKettles[q+1]);	
		}

	}

	public int Partition(int[] kettles,int p,int r,int kettle){
		
		int i=p-1;
		int key=0; //用来保存于kettle相等水量的水壶下标
		for(int j=p;j<=r;j++){

			if(kettles[j]<kettle)
				Exchange.exchange(kettles, j, ++i);
			
			if(kettles[j]==kettle)
				key=j;
		}
		
		Exchange.exchange(kettles, key, ++i);
		
		return i;
	}
	
	private int[] redKettles;
	private int[] blueKettles;
}
