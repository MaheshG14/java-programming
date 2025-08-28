

public class InvertedEquilaterTriangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 int consoleSize= 160;
		 
		 for(int i=1;i<=10;i++)
		 {
			 for(int j=1;j<=consoleSize/2-i ;j++)
			 {
				 System.out.print(" ");
			 }
				 for(int k=1;k<=i;k++)
				 {
					  System.out.print("* ");
				 } 
				 System.out.println(); 
				 
		 }	 
				 for(int i=10;i>=1;i--)
				 {
					 for(int j=1;j<=consoleSize/2-i ;j++)
					 {
						 System.out.print(" ");
					 }
						 for(int k=1;k<=i;k++)
						 {
							  System.out.print("* ");
						 } 
						 System.out.println(); 
						 
				 
		 }
	}
}

		
