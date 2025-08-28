package OopsClient;

import Oops.Child;

public class InheritanceClient {
	 
	public static void main(String[] args) {
		
		 Child child= new Child(1, "Parent", 2, "child");
		 
		 int id= child.getId();
		String name=  child.getName();
		
		System.out.println();
		int Childid = child.getChildid();
		String ChildName= child.getChildName();
		
		 System.out.println("id :"+id +" Name : " + name+" Childid : "+ Childid+" ChildName : "+ ChildName);
		 System.out.println(child.toString());
		
	}

}
