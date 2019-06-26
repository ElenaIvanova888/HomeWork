package LoopsAndArrays;
import java.util.Arrays;
import java.util.Scanner;



public class LoopsAndArrays {
	public static Scanner scanner = new Scanner(System.in);

	public static void Fibonachi(){
		int i0=1;
		int i1=1;
		int i2;
		for(int i=3;i<=10;i++){
			i2=i0+i1;
			System.out.print(i2+" ");
			i0=i1;
			i1=i2;
		}
		System.out.println();
	}
	public static void MinElementMassiv(int[] massiv){
		int min,result;
		min = massiv[0];
		for(int i=1;i<massiv.length;i++){
			if(massiv[i]<=min){
				min=massiv[i];
			}
		}
		System.out.println(min);
	}
	public static int Converting(int result){
		String result1 =Integer.toBinaryString(result);
		int length = result1.length();
		int resultString = 0;
		for(int i=0; i<length;i++){
			resultString=resultString<<1;
			if (result1.charAt(i)== '1'){
				resultString=resultString|1;
			}
		}
		return resultString;
	}
	public static String BinaryAndAgain(int enteredNumber){
		int mas2[] = {0, 1};
		int remainder;
		String binary = "";
	while(enteredNumber>0){
		remainder=enteredNumber%2;
		if(remainder > 0){
			binary += mas2[1];
		}
		else{
			binary += mas2[0];
		}
		enteredNumber=enteredNumber / 2;
	}
		System.out.print(binary);
return binary;
	}

	public static void main(String[] args){
		System.out.println("Binary number");
		int enteredNumber = 12;
		System.out.print("Enter  Number: ");
		BinaryAndAgain(enteredNumber);

		double result = 0;
		for (int i = 0; i < BinaryAndAgain(enteredNumber).length(); i++)
			result = result + Double.parseDouble(BinaryAndAgain(enteredNumber).substring(i, i + 1)) * Math.pow(2, i);
		System.out.print(" \nDecimal number: "+result);

		System.out.println("Min element massiv");
		int[] a={12, 4, 6, 3};
		MinElementMassiv(a);

		System.out.println("Sort massiv");
		int[] numbers = {2,5,3,47,4,22};
		for(int i = 0; i< numbers.length;i++){
			for(int j=0;j<numbers.length;j++){
				if(numbers[i]<numbers[j]){
					int temp = numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(numbers));

		System.out.println("\nFibonachi");
		Fibonachi();

		System.out.println("Enter word for reversing: ");
		String enteredWord = scanner.next();
		char[] string = enteredWord.toCharArray();

		System.out.println("Reversed word");
		String firstString = scanner.nextLine();
		System.out.println("Original String :" + firstString);
		char temp;
		char[] arr = firstString.toCharArray();
		int length = arr.length;
		for(int i=1; i<(firstString.length())/2; i++,length--){
			temp = arr[i];
			arr[i] = arr[length-1];
			arr[length-1] = temp;
		}

		System.out.println("Reverse String :" + String.valueOf(arr));

		System.out.println("Reversed word");
		String readstring = scanner.nextLine();
		System.out.println("Original String :" + readstring);
		char middle;
		char[] strings = readstring.toCharArray();
		int len = readstring.length();
		for(int i = 0;i<len/2;i++){
			if (readstring.charAt(i) != readstring.charAt(length - i - 1)){
				System.out.println("It isn`t palindrom");
			}else{
				System.out.println("It is palindrom");
			}

		}
	}


}
