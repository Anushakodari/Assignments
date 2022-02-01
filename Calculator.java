package com.simplilearn.program;
import java.util.Scanner;

public class Calculator {
  
	private static double number2;

	public static void main(String[] args) {
		// for calculator in java 
		
		// 1. take input numbers and operator from user
		
		// 2. take result variable and initialize to 0
		
		// 3. switch based on operator
		
		try (Scanner sc = new Scanner(System.in)) {
			double number1 = sc.nextDouble();
			
			char operator = sc.next().charAt(0);
			
			double number2 = sc.nextDouble();
			double result = 0.0;
			
			switch(operator) {
			case '+':
				result = number1 + number2;
				 System.out.println(result);
				 break;
			case '-':
				result = number1 - number2;
				 System.out.println(result);
				 break;
				 
			case '*':
				result = number1 * number2;
				 System.out.println(result);
				 break;
				 
			case '/':
				result = number1 / number2;
				 System.out.println(result);
				 break;
				 default :
					 System.out.println("Invalid operator");
					 break;		 		 			 
			}
		}
		
	}

}
