/*
 * @Author:OWASHIM CHOWDHURY
 * 
 * java program of no one can create object from outside the class
 * 
 * here i have used private in constructor thats why object creation from outside the class is not possible 
 */

package Assignment;

public class Object{
	int id;
	String name;
	private Object(int id,String name){  	//private constructor
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+ " "+name);		
	}	
}
 public class NobodyCanCreateObject{
 public static void main(String[]args) {
 Object sc =new Object(2,"owashim");	//
 sc.display();
 
 }	//end of main method
 }	//end of class
 
 
