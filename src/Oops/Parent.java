package Oops;

public class Parent 
{
  
	
	private int id ;
	 private String name;
	 
	 /*
		 * public Parent(){ System.out.println("Inside the parent class constructor ");
		 * 
		 * }
		 */
	 

	  public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	  public Parent(int id, String name) {
			super();
			this.id = 1;
			this.name = "Mahesh";
		}
	  
	  
	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
		public String toString() {
			return "Parent [id=" + id + ", name=" + name + "]";
		}
   
}
