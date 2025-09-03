package StringDemo;

public class Problem3 {
	
	public static void main(String[] args) {
		
		String name = "MaheshMahi";
		
		  
	getOcuurence(name, 'M', 2);
	
	getOcuurence(name, 'h', 2);

}

  public static void getOcuurence(String name , char input , int inputNumber) {
	  
	  char[] charArray = name.toCharArray();
	  
	  
	  int count =0;
	  for(int  i=0;i<charArray.length;i++)
	  {
		  if(charArray[i]==input)
		  {
			  count++;
		  }
		  
		  if(count==inputNumber)
		  {
			  System.out.println(inputNumber+" "+input+" occurence "+i);
			  break;
		  }
	  }
	  
  }
}
