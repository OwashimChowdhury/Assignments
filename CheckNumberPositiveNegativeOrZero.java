/*
 * @author: Owashim chowdhury
 * Java program to check a person is eligible to donate blood or not
*/
package Owas;
import java.util.Scanner;

public class CheckNumberPositiveNegativeOrZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i>0;i++) { 	//starting of for loop
			System.out.print("Enter a Number:");	//Scanner class
			int number=sc.nextInt();
			if(number>0) {
				System.out.println("It is a positive Number");	
			}	//end of if condition
			else if(number==0) {
				System.out.println("The Number is 0");
			}
			else {
				System.out.println("It is a Negative Number");
			} //end of else statement
		}		//end of for loop
	}			//end of main method
}				//end of class
