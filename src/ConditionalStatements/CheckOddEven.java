package ConditionalStatements;

import java.util.Scanner;

/**
 * created by elena 14-06-2019
 */
public class CheckOddEven {
	public static void main(String[] args){
		Scanner enteredNumber = new Scanner(System.in);
		System.out.println("Enter number:");

		int number = enteredNumber.nextInt();
		if(number%2 == 0){
			System.out.println("Even number");
		}else{
			System.out.println("Odd number");
		}
		System.out.println("Bye");
	}
}
