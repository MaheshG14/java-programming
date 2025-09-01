package Exception.handler;

public class FinallyBlock {

	    public static void main(String[] args) {
	        try {
	            int x = 5 / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("Caught exception: " + e.getMessage());
	        } finally {
	            System.out.println("This block always runs.");
	        }
	    
	}


}
