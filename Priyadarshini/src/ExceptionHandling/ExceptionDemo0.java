package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo0 {
	
	public static void main(String[] args) {
		System.out.println("Connection established ");
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter the value 1 : ");
		int a=sc.nextInt();
		System.out.println("Please enter the value2 to divide : ");
		int b=sc.nextInt();
		try {                                
		int c=a/b;
		System.out.println(c);
		} catch (Exception e) {                         
			System.out.println("Exception Handle");     
		}
		System.out.println("Connection terminated");
	}

}
