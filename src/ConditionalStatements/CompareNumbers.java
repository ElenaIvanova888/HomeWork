package ConditionalStatements;

import java.util.Scanner;

/**
 * created by elena 14-06-2019
 */
public class CompareNumbers {
	public static void main(String[] args){
		Scanner inputFirstNumber = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int firstNumber = inputFirstNumber.nextInt();

		Scanner inputSecondNumber = new Scanner(System.in);
		System.out.println("Enter the Second Number:");
		int secondNumber = inputSecondNumber.nextInt();

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
}
