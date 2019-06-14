package ConditionalStatements;

import java.util.Scanner;

/**
 * created by elena 14-06-2019
 */
public class CheckPassFail {
	public static void main(String[] args){

		Scanner enteredNumber = new Scanner(System.in);
		System.out.println("Enter mark:");

		int mark = enteredNumber.nextInt();
		if(mark>=50){
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println("Done");
	}
}
