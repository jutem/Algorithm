package com.jutem.practice;

/**
 * 
 * ��X[n],Y[n]���������Ѿ��ź�����X,Y�������鹲2n
 * ��Ԫ�ص���λ��
 * �㷨ʱ�临�Ӷ�O(lgn)
 * 
 * ����˼·����Ϊ�������鳤�Ⱦ�Ϊn��������ã�������λ��Ϊ�±�n������
 * ������λ������Ҳ��n����ͬʱȡ��x��y����λ�����бȽϣ���x����λ
 * ������y�ģ�˵����λ����С�ڵ���x��λ�����ߴ��ڵ���y��λ�������֡�������
 * ���ܱ�֤��λ���ұ�Ϊn�����ݣ�
 */
public class TwoArrayMedian {

	public static int getMedian(int[] x,int[] y){
		
		int xl=0; //x��߽�
		int xr=x.length-1; //x�ұ߽�
		int yl=0; //y��߽�
		int yr=y.length-1; //y�ұ߽�
		
		
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
				//��ֹֻ��������ʱ���֣���ȡ�ұ�ʱ������ѭ��
				xr=xMedian;
				if(yr-yl==1)
					yl=yMedian+1;
				else
					yl=yMedian;
			} else{		
				yr=yMedian;
				//��ֹֻ��������ʱ���֣���ȡ�ұ�ʱ������ѭ��
				if(xr-xl==1)
					xl=xMedian+1;
				else
					xl=xMedian;
			}	
		}
	}
}
