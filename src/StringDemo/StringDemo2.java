package StringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String s1="test1";
		 
		 String s2=new String("test");
		 
		 String s3="test2";
		 String s4="test2";
		 String s5="test1";
		
		  if(s1==s2)
		  {
			  System.out.println("s1 and s2 are equals");
		  }

		  if(s1==s3)
		  {
			  System.out.println("s1 and s3 are equals");
		  }

		  if(s3==s4)
		  {
			  System.out.println("s3 and s4 are equals");
		  }

		  if(s1==s4)
		  {
			  System.out.println("s1 and s4are equals");
		  }

		  if(s1.equals(s5))
		  {
			  System.out.println("s1 and s5 are equals");
		  }
		 
		 
	}

}
