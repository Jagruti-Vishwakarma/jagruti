package ExceptionHandling;

import java.util.Scanner;
public class ExceptionDemo {
	
	public static void main(String[] args) {
		System.out.println("Connection established ");
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter the value 1 : ");
		int a=sc.nextInt();
		System.out.println("Please enter the value2 to divide : ");
		int b=sc.nextInt();                        
		int c=a/b;
		System.out.println(c);
		System.out.println("Connection terminated");
	}

}
