package com.jutem.temp.test;

import java.util.Arrays;

import org.junit.Test;

public class LakeTest {

	@Test
	public void FindLakeTest(){
		FindLake(0);
	}
		
	private boolean FindLake(int line){
		
		if(line==lines){
			if(finalVerify()){
				for(int l=0;l<lines;l++){
					System.out.println(Arrays.toString(n[l]));
					System.out.println(Arrays.toString(store[l]));
				}

				return true;
			}
			else
				return false;
		}
		
		for(int r=0;r<rows;r++){
			
			if(n[line][r]>0){
				
				if(!VerifyRow(line,r) || !verifyHave(line, r))
					continue;
				
				Store(line,r);
				clean(line,r);
				boolean tag=FindLake(line+1);
				if(!tag)
					reset(line);
				else
					return true;
			}
		}
		return false;
	}
	
	/**
	 * 当前值与所在列数据绝对值相同，但是和为0
	 */
	private boolean VerifyRow(int line,int row){
		
		//检查小于当前行以上的行
		for(int l=0;l<line;l++){
			if(n[line][row]==-n[l][row])
				return false;
			if(n[l][row]>0 && n[line][row]!=n[l][row])
				return false;
		}

		return true;
	}
		
	/**
	 * 当前值已经在之前确定过，但是不在同一列
	 */
	private boolean verifyHave(int line,int row){
		
		for(int l=0;l<lines;l++)		
			if(n[line][row]==store[l][0] && (store[l][1]-1)!=row)
				return false;
		return true;
	}
	
	/**
	 * 存储已经确定的答案，0放数据，1放列位置
	 */
	private void Store(int line,int row){
		
		store[line][0]=n[line][row];
		store[line][1]=row+1; //区别0列
	}
	
	/**
	 * 将当前行的元素置为负数，除当前数字外
	 */
	private void clean(int line,int row){
		
		for(int r=0;r<rows;r++){
			if(r==row)
				continue;
			n[line][r]=-Math.abs(n[line][r]);
		}
	}
	
	/**
	 * 重置当前行数据和store数据
	 */
	private void reset(int line){

		for(int r=0;r<rows;r++)
			n[line][r]=Math.abs(n[line][r]);
		store[line][0]=0;
		store[line][1]=0;
		if(line+1<4){
			store[line+1][0]=0;
			store[line+1][1]=0;
		}

	}
	
	/**
	 * 最终测试
	 * 确认是否被存储的数据与同列的数据没有和为0，即同一个数据即使正数又是负数
	 */
	private boolean finalVerify(){
		
		for(int i=0;i<store.length;i++)
			for(int l=0;l<lines;l++){
			
				if(n[l][store[i][1]-1]==-store[i][0])
					return false;
			}
		return true;
		
	}
	
	private int[][] n=new int[][]{
			{1,0,3,4},
			{4,3,2,1},
			{0,0,1,4},
			{3,4,1,2}};

	private int lines=4;
	private int rows=4;
	private int[][] store=new int[lines][2];
}