package OopsClient;

import Oops.Base1;
import Oops.Derived1;
import Oops.Derived2;

public class HierarchicalClient {

	public static void main(String[] args) {  
		
		
		 Base1 base=new Base1("type");
		 
		  Base1 base1 = new Derived1("parenttype", "Child1");

		  
		  base.m1();
		  
		  Derived1 derived=new Derived1("parent", "Child1" );
		  
		  System.out.println(" after creating object parent type : "+derived.getChildType()+" Childtype :"+derived.getChildType());
			 
		  derived.setType("Parent1");
		  derived.setChildType("Child2");
		  
		  System.out.println("parent type: "+derived.getType()+" Childtype : "+derived.getChildType());
		  
		  
		  System.out.println();
          Derived2 derived1=new Derived2("parent1", "Child3" );
		  
		  System.out.println(" after creating object parent type : "+derived1.getType()+" Childtype :"+derived1.getChildType());
			 
		  derived1.setType("Parent2");
		  derived1.setChildType("Child4");
		  
		  System.out.println("parent type: "+derived1.getType()+" Childtype : "+derived1.getChildType());
		  
		  
	}

}
