package NumberSeries;

public class Palimdrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String name ="Madam";
		 System.out.println("Name :"+ name);
		  char[] chararray= name.toCharArray();
		  for(int i=name.length()-1;i>=0;i--)
		  {
			  System.out.print(chararray[i]);
		  }

	}

}
