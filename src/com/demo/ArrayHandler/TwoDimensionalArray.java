package com.demo.ArrayHandler;

public class TwoDimensionalArray {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numberarray =new int [2][3];
		
		
		//Row 1
		numberarray[0][0] =1;
		numberarray[0][1]=2;
		numberarray[0][2]=3;
		
		//Row 2
		numberarray[1][0] =4;
		numberarray[1][1]=5;
		numberarray[1][2] =6;
		
		for(int i=0;i<numberarray.length;i++)
		{
			for(int j=0;j<numberarray[i].length;j++)
			{
				System.out.print(numberarray[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
