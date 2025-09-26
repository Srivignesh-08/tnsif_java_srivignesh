package basic.java;

import java.util.Scanner;

public class AdditionScanner {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enther the first number:");
		
		int a=s.nextInt();
		System.out.println("enther the second number:");
		int b=s.nextInt();
		
		
		int c=a+b;
		System.out.println("addition of a= "+a+" and b= "+b+" is "+c);
	}

}
