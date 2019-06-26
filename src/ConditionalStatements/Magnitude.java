package ConditionalStatements;
import java.util.Scanner;

/**
 * created by elena 14-06-2019
 */
public class Magnitude {
	public static Scanner scanner = new Scanner(System.in);
	public static void MagnitudeTwonNumber(double aNumber, double bNumber){
		if(aNumber== 0 && bNumber == 0){
			System.out.println("Output: 0");
		}
		else if(aNumber == 0){
			System.out.println("Output: "+bNumber);
		}else if(bNumber == 0){
			System.out.println("Output: "+aNumber);
		}else if(Math.abs(aNumber)> Math.abs(bNumber)) {
			System.out.println("Output" + aNumber);
		}else if(Math.abs(aNumber)< Math.abs(bNumber)) {
			System.out.println("Output" + bNumber);
		}else{
			System.out.println("Invalida data");
		}
	}

	public static void main(String[] args){
		System.out.println("Enter the A Number:");
		double aNumber = scanner.nextDouble();

		System.out.println("Enter the B Number:");
		double bNumber = scanner.nextDouble();
		MagnitudeTwonNumber(aNumber,bNumber);
	}
}
