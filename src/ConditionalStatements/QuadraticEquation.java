package ConditionalStatements;
import java.util.Scanner;

/**
 * created by elena 14-06-2019
 */
public class QuadraticEquation {
	public static Scanner scanner = new Scanner(System.in);
	public static void quadraticEquationOn(double aNumber,double bNumber, double cNumber){
		if(aNumber == 0 && bNumber == 0 && cNumber ==0){
			System.out.println("x can be any number. Result: 0");
		}else if(aNumber == 0 && bNumber == 0){
			System.out.println("There isn`t answer");
		}else if(aNumber == 0){
			double xNumber = -cNumber/bNumber;
			System.out.println("Answer for x: "+xNumber);
		}else if(bNumber == 0){
			double xResult =Math.sqrt(-cNumber/aNumber);
			System.out.println("Result x=-"+xResult+" x=+"+xResult);
		}else if(cNumber == 0){
			double xResultTwo = -bNumber/aNumber;
			System.out.println("Result x=");
		}else{
			double discriminant = Math.pow(bNumber,2)-4*aNumber*cNumber;
			if(discriminant>0){
				double x1 = (-bNumber+Math.sqrt(discriminant))/(2*aNumber);
				double x2 = (-bNumber-Math.sqrt(discriminant))/(2*aNumber);
				System.out.println("Result such x1="+x1+" x2="+x2);
			}else if(discriminant<0){
				System.out.println("No solutions");
			}else if(discriminant==0){
				double result = -bNumber/(2*aNumber);
				System.out.println("Result: "+result);
			}
		}
	}

	public static void main(String[] args){
		System.out.println("Enter the A Number:");
		double aNumber = scanner.nextDouble();

		System.out.println("Enter the B Number:");
		double bNumber = scanner.nextDouble();

		System.out.println("Enter the C Number:");
		double cNumber = scanner.nextDouble();

		quadraticEquationOn(aNumber,bNumber,cNumber);

	}
}
