package OopsClient;

import Oops.Student;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st=new Student();
		
		
		
		st.setStudentId(1);
		st.setName("Mahesh");
		st.setGender("Male");
	//	st.setPhoneNumber(800841641);

		
		 // access the data with object refferences 
		
            
             String gender = st.getGender();
           //  String name = st.getName();
             Long phoneNumber = st.getphoneNumber();
             int studentId = st.getstudentId();
             
              System.out.println("id "+studentId  +"gender "+gender+" Phonenumber"+phoneNumber);
              
            
               
              Student s1=new Student();
              

      		s1.setStudentId(2);
      		s1.setName("Mahesh");
      		s1.setGender("Male");
      	//	s1.setPhoneNumber(8008416418);
      		
      		 System.out.println(s1.toString());

            
            		 
	}


}
