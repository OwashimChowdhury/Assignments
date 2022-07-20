/*
 * author:owashim chowdhury
 * 
 * Create an array "marks1" that will store five elements ,copy this array to another array marks2
 *  using clone() method and update the value of index2, then print the values of array. 
 */

package Array;

public class CloneArrayAssignment {

	public static void main(String[] args) {
		int marks1[]= {90,80,77,89,96};//declaring and initializing a array
		System.out.println("printing the actual array marks:");
		for(int element:marks1)	//printing the values using for each loop
			System.out.println(element);//printing the actual array
		
		System.out.println("printing the clone array marks or updated marks:");
		int marks2[]=marks1.clone();//declaring marks2 array and copying the values using clone() method
		marks2[2]=88;	//updated the value of index 2
		for(int value:marks2)
			System.out.print(value+" ");//printing the clone array with updated value

	}

}
