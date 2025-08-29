package Oops.Abstraction;

public class AbstractHandler1 {
	
	public static void main(String[] args) {
		
		
	             	// request1
	          	BaseProvider baseProvider= new vendor1();
	         	baseProvider.m1();
         		baseProvider.m2();
        		baseProvider.m3();
		
        		System.out.println();
		
		                   // request2
				BaseProvider baseProvider1= new vendor2();
				baseProvider1.m1();
				baseProvider1.m2();
				baseProvider1.m3();
				
				System.out.println();
				
	            			// request3
				BaseProvider baseProvider2= new vendor3();
				baseProvider2.m1();
				baseProvider2.m2();
				baseProvider2.m3();
	}


}

 abstract class BaseProvider
{
	public void m1()
	{
		 System.out.println("Inside the beseprovider m1");
	}
	public void m2()
	{
		 System.out.println("Inside the beseprovider m2");
	}
	
	abstract void m3();
}
	
	class vendor1 extends BaseProvider
	{

		@Override
		void m3() {
			// TODO Auto-generated method stub
			System.out.println("Inside the vendor1 m3");
		}
		
	}
	class vendor2 extends BaseProvider
	{

		@Override
		void m3() {
			// TODO Auto-generated method stub
			System.out.println("Inside the vendor2 m3");
			
		}
		
	}
	class vendor3 extends BaseProvider
	{
		@Override
		public void m2()
		{
			 System.out.println("Inside the vendor3 m2");
		}

		@Override
		void m3() {
			// TODO Auto-generated method stub
			System.out.println("Inside the vendor2 m3");
		}
	
}
