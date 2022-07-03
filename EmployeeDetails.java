/*
 * @Author :owashim chowdhury
 * java program to create a object without new keyword
 */
package Assignment;
 class Details{
	int id;
	String name;
	void details1(int id,String name){
		this.id=id;
		this.name=name;
	}
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
			Details rv1= Details.class.newInstance(); //newInstance() method
			Details rv2= Details.class.newInstance(); //newInstance() method
			Details rv3= Details.class.newInstance(); //newInstance() method
			Details rv4= Details.class.newInstance(); //newInstance() method
			rv.details1(11, "owashim");
			rv1.details1(12, "sahil");
			rv2.details1(13, "rohit");
			rv3.details1(14, "rahul");
			rv4.details1(15, "rajeeb");
			rv.display();
			rv1.display();
			rv2.display();
			rv3.display();
			rv4.display();
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}	//end of main method
}	//end of class
