package string;
/*
 * author owashim chowdhury
 */
import java.util.Scanner;

public class StringTest1 {
	
	 public void show() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter string:");
		 String a=sc.nextLine();
		 String b=sc.nextLine();
		 
		 System.out.println(a.length()+b.length());//adding 1st string length and 2nd string length
		 System.out.println(a.compareTo(b)>0 ? "yes":"no");//comparing  
		 System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)
		 +" "+b.substring(0,1).toUpperCase()+b.substring(1));//converting 1st letter to capital letter
	sc.close();
	 }

	public static void main(String[] args) {
		StringTest1 st=new StringTest1();
		st.show();//calling
	
	}

}
