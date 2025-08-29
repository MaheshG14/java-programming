package Oops.Abstraction;

public class AbstractHandler3 
{
	
	public static void main(String[] args)
	{
		
		Base1 b= new Derived();
		b.m1();
		b.m2();
		
	}


}

interface Base1
{
	void m1();
	
	void m2 ();

}
interface Base2
{
	void m1();
	
	void m3 ();

}

class Derived implements Base1,Base2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	 System.out.println("inside the Derived m1()");	
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("inside the Derived m2()");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
}


 