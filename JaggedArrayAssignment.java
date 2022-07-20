/*
 * author:owashim chowdhury
 * 
 * Create a jagged array of two row ,1st row will contain 3 subjects marks and 2nd row will contain 5 subjects marks 
 * and take the values from user.
 */
package Array;

import java.util.Scanner;

public class JaggedArrayAssignment {

	public static void main(String[] args) {
		//declaring a jagged array
		int [][] marks=new int[2][];
		marks[0]=new int [3];	//declaring the number of columns in row 1
		marks[1]=new int [5];	//declaring the number of columns in row 2
		//creating scanner class object to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks for row1::");//taking input for row 1
		for(int i=0;i<marks[0].length;i++) {//logic to take input for row1 and assign the value
		marks[0][i]=sc.nextInt();}	//assigning the values
		
		System.out.println("enter marks for row2::");//taking input for row2
		for(int i=0;i<marks[1].length;i++) {//logic to take input for row2 and assign the value
			marks[1][i]=sc.nextInt();}//assigning the values for row2
		
		//printing the array
		System.out.println("printing the array:");
		for (int i=0;i<marks.length;i++) {	//logic to print the array
			for (int j=0;j<marks[i].length;j++) {
		System.out.print(marks[i][j]+" ");}
			System.out.println(" ");
		}	
	}
}
