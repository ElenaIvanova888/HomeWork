package ConditionalStatements;

import java.util.Scanner;
/**
 * created by elena 14-06-2019
 */
public class PrintDayInWord {
	public static void main(String[] args) {

		Scanner selectVariant = new Scanner(System.in);
		System.out.println("Select variant:");

		int variant = selectVariant.nextInt();
		Scanner enterdMonth = new Scanner(System.in);
		int day = enterdMonth.nextInt();

		switch (variant) {
			case 1:
				switch(day){
					case 1:
						System.out.println("Sunday");
						break;
					case 2:
						System.out.println("Monday");
						break;
					case 3:
						System.out.println("Tuesday");
						break;
					case 4:
						System.out.println("Wednesday");
						break;
					case 5:
						System.out.println("Thursday");
						break;
					case 6:
						System.out.println("Friday");
						break;
					case 7:
						System.out.println("Saturday");
						break;
					default:
						System.out.println("Not a valid day");
						break;

				}
				break;
			case 2:
				if(day == 1){
					System.out.println("Sunday");
				}else if(day == 2){
					System.out.println("Monday");
				}else if(day == 3){
					System.out.println("Tuesday");
				}else if(day == 4){
					System.out.println("Wednesday");
				}else if(day == 5){
					System.out.println("Thursday");
				}else if(day == 6){
					System.out.println("Friday");
				}else if(day == 7){
					System.out.println("Saturday");
				}else{
					System.out.println("Not a valid day");
				}
				break;
			default:
				System.out.println("It isn`t correct");
				break;
		}
	}
}
