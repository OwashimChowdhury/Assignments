/*
 * @Author :owashim chowdhury
 * java program to create a object without new keyword
 */
package Assignment;
 class Details{
	int id=11;
	String name="owashim";
	
	void display() {
		System.out.println(id+"  "+name);
	}
}
 public class EmployeeDetails {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("id"+"  "+"name");
		try {
			
			Details rv= Details.class.newInstance(); //newInstance() method
			rv.display();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}	//end of main method
}	//end of class
