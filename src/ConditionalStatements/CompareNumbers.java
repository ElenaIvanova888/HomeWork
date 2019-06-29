package ConditionalStatements;

import java.util.Scanner;

/**
 * created by elena 14-06-2019
 */
public class CompareNumbers {
	public static Scanner scanner = new Scanner(System.in);
	public static void compreNumbers(int firstNumber, int secondNumber){
		if(firstNumber > secondNumber){
			System.out.println("The number "+firstNumber+" has the greatest value");
		}else if(firstNumber < secondNumber) {
			System.out.println("The number " + secondNumber + " has the greatest value");
		}else if (firstNumber == secondNumber){
			System.out.println("numbers are identical");
		}else{
			System.out.println("Entered data isn`t correct");
		}
	}
	public static void main(String[] args){
		System.out.println("Enter the First Number:");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter the Second Number:");
		int secondNumber = scanner.nextInt();

		compreNumbers(firstNumber,secondNumber);
	}
}
