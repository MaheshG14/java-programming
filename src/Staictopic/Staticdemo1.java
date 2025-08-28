package Staictopic;

public class Staticdemo1 {
	
	// static variable load first

	
	
	private static  String organizationName;
	private static String traineeName;
	private static  String address= "Hyderabad";
	
	static {
		
		// static block will load after variable  load 
		System.out.println("address :"+address);
		organizationName = "Technology";
		traineeName ="Mahesh";
		
		address= "test";
	}
		
		public static String OrganizationDetails()
		{
			return organizationName+" "+traineeName+" "+address+" ";
		}
	

}
