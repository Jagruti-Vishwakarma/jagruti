package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo4 {
	public static void main(String[] args) {

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

	} catch (Exception e) {                                  // It is already handled by the catch block exception
		System.out.println("Divided by zero is not allowed");
	}
	//catch (ArithmeticException e) {
		System.out.println("Divided by zero is not allowed");
	//} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Please enter the defined index numbers within a range");
//	} catch (NegativeArraySizeException e) {
//		System.out.println("Please enter the positive numbers");
//	} 
//	} System.out.println("Connection terminated");
	}
}




