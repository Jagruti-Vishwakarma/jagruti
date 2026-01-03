package ExceptionHandling;

import java.util.Scanner;

public class ExeptionDemo3 {

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

	} catch (ArithmeticException e) {
		System.out.println("Divided by zero is not allowed");
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Please enter the defined index numbers within a range");
	} catch (NegativeArraySizeException e) {
		System.out.println("Please enter the positive numbers");
	} catch (Exception e) {                                             // put these in upper 
		System.out.println("Divided by zero is not allowed");
	} System.out.println("Connection terminated");
	}
}
