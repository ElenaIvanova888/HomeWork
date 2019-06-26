package ConditionalStatements;

import java.util.Scanner;

public class TaskWithRubl {
	public static Scanner scanner = new Scanner(System.in);
	public static void CheckingDiscount(int sumOfOrder){
		if(sumOfOrder>=1000){
			System.out.println("Sum of order is "+sumOfOrder+"You will get the 15% discount");
		} else{
			System.out.println("\nYou won`t get discount");
		}
	}

	public static void main(String[] args){
		System.out.println("Tasks with discount.\nEnter sum of order: ");
		int sumOfOrder = scanner.nextInt();
		CheckingDiscount(sumOfOrder);
	}
}
