package Oops.Polymorphism;

public class OverloadHandler
{
	public void m1(int v1, String v2)
	{
		System.out.println("inside m1 method int , String :");
	}
	public void m1(String v1, int v2)
	{
		System.out.println("inside m1 method String , int :");
	}
	public int m1(String v1, int v2 , String v3)
	{
		return Integer.parseInt(v1);
	}
	
	public static void main(String[] args)
	{
		OverloadHandler o=new  OverloadHandler();
		o.m1(1, "mahi");
		o.m1("varun", 2);
		int v11=o.m1("1", 3, "mahesh");
		  System.out.println("inside m1 method String , int, String  :"+ v11);
	}

}
