
import java.util.Scanner;

public class JavaOparetors {

	public static void main(String[] args) {
		 Scanner S=new Scanner(System.in);
		    int a=50;
		    int b=100;
		    		int count=0;
		    if(a<=b)
		    {
		     for(int i=a;i<=b;i++)
		      { 
		        if(i%11==0)
		        {
		          System.out.print(i+" ");
		          count++;
		        }
		      }
		      if(count==0)
		       System.out.print("NO NUMBERS");
		    }
		    else 
		    {
		      System.out.print("INVALID RANGE");
		    }
	}
}
