package com.jutem.practice;

import com.jutem.util.Exchange;


/**
 * 
 * @author jutem
 * ��Ŀ������
 * �������n����ɫˮ����n����ɫˮ������ɫˮ����ˮ������ͬ����ɫҲһ�������⣬����ÿһ����ɫ
 * ˮ������һ����֮ˮ����ȵ���ɫˮ����
 * ������Ҫ�ҳ�ˮ����ȵĺ���ˮ����Ϊ�˴���һĿ�ģ��������²�������ѡһ��ˮ����һ��һ������
 * ��ˮע����ɫˮ����Ȼ������ɫˮ����ͨ����һ�������ж���ֻˮ���е�ˮ�࣬����һ��������һ��
 * ������Ҫһ����λʱ�䡣Ŀ�����ҳ�һ���㷨��ͨ�����ٴ����Ƚϣ�ȷ�������������⡣
 * ���⣺
 * 1.����һ��ȷ���͵��㷨�����ˮ����ԣ��㷨ƽ��ʱ�临�Ӷ�n^2
 * 2.֤��:����ִ�еıȽϴ����½�Ϊnlgn
 * 3.����һ��������㷨�������ıȽϴ����Ͻ�Ϊnlgn����֤�����������ȷ�ġ���������㷨���
 * ����µıȽϴ�����ʲô
 * 
 * ˼·��
 * ������������ˮ���ź�����Ȼ���Һö���
 * ���ÿ������򡣸��ݺ�ɫˮ���ָ���ɫˮ����ͬ����Էָ��ɫˮ��
 */
public class RedAndBlueKettle {
	
	public RedAndBlueKettle(int[] redKettles,int[] blueKettles){
		
		this.redKettles=redKettles;
		this.blueKettles=blueKettles;
	}
	/**
	 * 
	 * @param kettles ���ָ��ˮ����
	 * @param kettle �����ָ��ˮ��
	 * 
	 * ����ɫˮ���ָ��ɫˮ���󣬽��õ�����ɫˮ�����ˮ���ĺ�ɫˮ�������ָ���ɫˮ��
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
		int key=0; //����������kettle���ˮ����ˮ���±�
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
