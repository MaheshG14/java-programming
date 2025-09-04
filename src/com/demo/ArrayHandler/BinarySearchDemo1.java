package com.demo.ArrayHandler;

public class BinarySearchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numberArray[]= {1,4,6,3,7};
		
		for(int i=0;i<numberArray.length;i++)
			
		{
			for(int j=i+1;j<numberArray.length;j++)
			{
				// sort the elements is assending order
				
			//	if(numberArray[j] < numberArray[i]) {
				
					// sort the elements is desending order
				
					if(numberArray[j] > numberArray[i]) {
					int temp =numberArray[i];
					
					numberArray[i]=numberArray[j];
					numberArray[j]=temp;
					
				}
					
			}
		}
		
		for(int res:numberArray)
			System.out.print(res+" ");
	}

}
