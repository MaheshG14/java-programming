package Oops;

public class Derived2 extends Base1{
	
	
	private String childType;
	
	public Derived2( String type ,String childType )
	{
		super(type);
		this.childType=childType;
			
	}
	
	
	public String getChildType() {
		return childType;
	}


	public void setChildType(String childType) {
		this.childType = childType;
	}


	public void m2()
	{
		System.out.println("inside Derived2 m2()");
		
	}
	@Override
	public String toString() {
		return "Derived2 [childType=" + childType + "]";
	}

    
}
