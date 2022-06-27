/*
 * @author: Owashim chowdhury
 * Java program to check a person is eligible to donate blood or not
*/
package Owas;

import java.util.Scanner; 

public class EligibleToDonateBloodOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //Scanner class
		
		for(int i=1;i>0;i++) {
		
		System.out.print("Enter your age:");	//Scanner class
		int age=sc.nextInt();
		System.out.print("Enter your weight:");
		int weight=sc.nextInt();
		
		if (age>25 && weight>48) {		//logic
		System.out.println("YOU ARE ELIGIBLE TO DONATE BLOOD");
		}	//end of if statement
		else {
			System.out.println("YOU ARE NOT ELIGIBLE TO DONATE BLOOD");
		}	//end of else statement
		}	//end of for loop
	}		//end of main method
}			//end of class
