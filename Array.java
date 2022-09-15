package Owas;
/*
 * @Author :owashim chowdhury
 * java program to print the elements of array using for each loop
 */
public class Array {

	public static void main(String[] args) {
		//creating array
		int [] age= {5,7,9,55,44,66,34,26,45,34};  //array
		
		//for each loop
		 for (int element:age) {
			 System.out.print(" "+element);
		 }

	}

}
