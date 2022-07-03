
package Assignment;

/**
 * @author OWASHIM CHOWDHURY
 *  switch case statement for string type variable
 */
import java.util.*;
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//taking input from user
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.nextLine();
		sc.close();
		
		//switch case statement
		switch(name) {
		case "rohit":System.out.println("switcyh case is easy for rohit");
		break;
		case "owashim":System.out.println("switcyh case is easy for owashim");
		break;
		case "rahul":System.out.println("switcyh case is easy for rahul");
		break;
		case "riya":System.out.println("switcyh case is easy for riya");
		break;
		case "amit":System.out.println("switcyh case is easy for amit");
		break;
		case "sahil":System.out.println("switcyh case is easy for sahil");
		break;
		default:System.out.println("name not match");
		}
		
		}
}
