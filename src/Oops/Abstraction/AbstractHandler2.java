package Oops.Abstraction;

public class AbstractHandler2 
{
	
	public static void main(String[] args)
	{
		
		BaseService baseService = new VendorService1() ;
		
		baseService.m1();
		baseService.m2();
		
	}


}

interface BaseService
{
	void m1();
	
	void m2 ();
	
	
}

 class VendorService1 implements BaseService
 {

	@Override
	public void m1() {
		
		System.out.println("inside the  VendorService1 m1()");
	}

	@Override
	public void m2() {
		
		System.out.println("inside the  VendorService1 m2()");
	}

	 class VendorService2 implements BaseService
	 {

		@Override
		public void m1() {
			System.out.println("inside the  VendorService2 m1()");
			
		}

		@Override
		public void m2() {
			
			System.out.println("inside the  VendorService2 m2()");
		}
	 
	 }
 }
 