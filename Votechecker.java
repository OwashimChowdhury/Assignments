/*
 * @author: Owashim chowdhury
 * Java program to check a person is eligible for vote or not 
*/


package Owas;
import java.util.Scanner;   

public class Votechecker {   //created a class

	public static void main(String[] args) {
		
		for(int i=1;i>0;i++) {
			
		Scanner a=new Scanner(System.in);  //Scanner class
		System.out.print("Enter your age:");
		int age=a.nextInt();
		
		if(age>=18){
			System.out.println("You are eligible for vote");
		}	//end of if statement
		else {
			System.out.println("You are not eligible for vote");
		} 	//end of else statement
	}		//end of for loop
	}		//end of main method

}			//end of class
