package StringDemo;

public class Problem1 {
	
	public static void main(String[] args) {
		
		String name = "Mahesh";
		
		 char[] charArry = name.toCharArray();
		 
		 int number=2;
		 int count=0;
		 for(int i=0;i<charArry.length;i++)
		 {
			 if(charArry[i]=='h')
			 {
				 count++;
		 }
		 if(count==number)
		 {
			 System.out.println(count);
			 break;
		 }
		
	}
	}

}
