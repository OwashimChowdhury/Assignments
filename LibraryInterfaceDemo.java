/*
 * @author:Owashim chowdhury
 * java program of Interface 
 */
package Assignment;

interface LibraryUser{
	void registerAccount();  //method without body
	void requestBook();  //method without body
}
//child class implements interface
class KidUser implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount(){
		//if else statement
		if(age<12)
			System.out.println("You have successfully registered under a Kids Account");
		else 
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
	}
	public void requestBook() {
		if (bookType=="kids")
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books");
	}
}
class AdultUser implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount(){
		if(age>12)
			System.out.println("You have successfully registered under an Adult Account");
		else 
			System.out.println( "Sorry, Age must be greater than 12 to register as an adult");
	}
	public void requestBook() {
		if (bookType=="Fiction")
			System.out.println("Book Issued successfully, please return the book within 7 days");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");
	}
}


public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		//creating object, set value and calling
		KidUser kd=new KidUser();
		kd.age=10;
		kd.bookType="kids";
		kd.registerAccount();
		kd.requestBook();
		
		kd.age=18;
		kd.bookType="Fiction";
		kd.registerAccount();
		kd.requestBook();
		
		//creating object, set value and calling
		AdultUser ad=new AdultUser();
		ad.age=5;
		ad.bookType="kids";
		ad.registerAccount();
		ad.requestBook();
		
		ad.age=23;
		ad.bookType="Fiction";
		ad.registerAccount();
		ad.requestBook();	
	}
}	//end of main class
