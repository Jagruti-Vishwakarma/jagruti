package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Connection established ");
			Scanner sc=new Scanner (System.in);
			System.out.println("Please enter the value 1 : ");
			int a=sc.nextInt();
			System.out.println("Please enter the value2 to divide : ");
			int b=sc.nextInt();                      
			int c=a/b;
			System.out.println(c);
			
			System.out.println("Enter the size of an array: ");
			int size=sc.nextInt();
			
			int arr[] = new int[size];
			
			System.out.println("Enter the index number of array: ");
			int n=sc.nextInt();
			arr[n]=999;

	} catch (Exception e) {
		System.out.println("Divided by zero is not allowed");
	}
		System.out.println("Connection terminated");
	}
}


// As seen in the above program regardless of the type of exception we received the same message this is because we are using 
//a single catch block these disadvantage can be overcome by making the use of multiple catch blocks
