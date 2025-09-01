package Exception.handler;

public class Example2 {
	public static void main(String[] args) {
		
	
	try {
		int [] num = {1,2,3}; 
		System.out.println(num[1]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	
	{
		System.out.println("Error: Index is out of range");
	}

}
}