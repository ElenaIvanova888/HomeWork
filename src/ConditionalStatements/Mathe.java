package ConditionalStatements;

import java.util.Scanner;

public class Mathe {
	public static Scanner scanner = new Scanner(System.in);
	public static void CircleFits(double sCircle,double sSquare){
		double diagonalSquare = 2*sSquare;
		double diametrCircle = Math.PI*sCircle;
		if(diagonalSquare>=diametrCircle){
			System.out.println("Circle in Square");
		}else if(diagonalSquare<=diametrCircle){
			System.out.println("Square in Circle");
		}else{
			System.out.println("Square isn`t in Circle or another ");
		}
	}

	public static void Divisor(double a, double b){
		double result = b%a;
		if(result == 0){
			System.out.println("Number A is a divisor of number B");
		}else{
			System.out.println("Number A isn`t a divisor of number B");
		}
	}

	public static void CheckingInterval(double intervalA, double intervalB){
		int enteredFroCheckingNumber = scanner.nextInt();
		if(intervalA<=enteredFroCheckingNumber && enteredFroCheckingNumber<=intervalB){
			System.out.println("Number is in interval");
		}else{
			System.out.println("Number isn`t in interval");
		}
	}

	public static void TriangleChecking(double sideA, double sideB,double sideC){
		if (sideA==sideB){
			System.out.println("triangle is isosceles");
		}else{
			System.out.println("triangle isn`t isosceles");
		}
	}

	public static void CompareNumber(double firstNumber, double secondNumber, double thirdNumber){
		if(firstNumber<=secondNumber && firstNumber<=thirdNumber){
			System.out.println("small:"+firstNumber);
			if(secondNumber<=thirdNumber){
				System.out.println("big:"+secondNumber);
				System.out.println("med:"+thirdNumber);
			}else{
				System.out.println("big:"+thirdNumber);
				System.out.println("med:"+secondNumber);
			}
		}else if(firstNumber>=secondNumber && firstNumber>=thirdNumber){
			System.out.println("big:"+firstNumber);
			if(secondNumber<=thirdNumber){
				System.out.println("small:"+secondNumber);
				System.out.println("med:"+thirdNumber);
			}else{
				System.out.println("small:"+thirdNumber);
				System.out.println("med:"+secondNumber);
			}
		}else{
			System.out.println("med:"+firstNumber);
			if(secondNumber<=thirdNumber){
				System.out.println("small:"+secondNumber);
				System.out.println("big:"+thirdNumber);
			}else{
				System.out.println("small:"+thirdNumber);
				System.out.println("big:"+secondNumber);
			}
		}
	}
	public static void main(String[] args){
		System.out.println("Select exercise: 1- circle fit square and vice versa\n" +
				"2-task about divisor\n" +
				"3-Check number on interval\n" +
				"4-triangle is isosceles or not?\n" +
				"5-compare numbers\n" +
				"Enter");
		int number = scanner.nextInt();
		switch(number){
			case 1:
				System.out.println("Circle fit square and vice versa");
				double sCircle = 29.6;
				double sSquare = 28.4;
				CircleFits(sCircle,sSquare);
				break;
			case 2:
				System.out.println("task about divisor");
				double a = 2;
				double b = 6;
				Divisor(a,b);
				break;
			case 3:
				System.out.println("Check number on interval");
				double intervalA = -5;
				double intervalB = 3;
				CheckingInterval(intervalA,intervalB);
				break;
			case 4:
				System.out.println("triangle is isosceles or not?");
				int sideA = 2;
				int sideB = 2;
				int sideC = 7;
				TriangleChecking(sideA,sideB,sideC);
				break;
			case 5:
				System.out.println("compare numbers");
				int firstNumber =5;
				int secondNumber=4;
				int thirdNumber =1;
				CompareNumber(firstNumber,secondNumber,thirdNumber);
				break;
			default:
				System.out.println("Issue with entered data.Please check!");
				break;
		}
	}
}
