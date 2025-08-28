package Oops;

public class Child  extends Parent {
	
	 private int Childid;
	 private String ChildName;
	
	/*
	 * public Child() { super(); }
	 */
	
		/*
		 * public Child() { super(1,"Mahesh"); }
		 */
        


		/*
		 * public Child(int id, String name, int ChildId, String ChildName) { super(id,
		 * "Name"); }
		 */
	public Child( int id, String  Name,int ChildId, String ChildName)
	
	{
		super(id,"Name");
		this.Childid=ChildId;
		this.ChildName=ChildName;
	}
	
	

	public int getChildid() {
		return Childid;
	}
 
	public void setChildid(int childid) {
		Childid = childid;
	}

	public String getChildName() {
		return ChildName;
	}

	public void setChildName(String childName) {
		ChildName = childName;
	}

	@Override
	public String toString() {
		return "Child [Childid=" + Childid + ", ChildName=" + ChildName + "]";
	}
}
