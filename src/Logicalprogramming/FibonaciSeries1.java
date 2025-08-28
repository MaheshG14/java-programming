package Logicalprogramming;


public class FibonaciSeries1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		 // FibonaciSeries 
		
	//3
//	0,1,1,2
              
		int n=10;
		 int a=0;
		 int b=1;
		 
		  for (int i=0;i<=n;i++)
			  
		  {
			  System.out.println(a+" ");
			  int c=a+b;
			   a=b;
			   b=c;
			   
		  }
	}

}
