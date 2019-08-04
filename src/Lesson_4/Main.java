package Lesson_4;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static int convertion10to2(int number){
		int decNumber = 0;
		int i = 0;
		int result;
		while(number!=0){
			result = number%10;
			number/=10;
			decNumber += result*Math.pow(2,i);
			++i;
		}
		return decNumber;
	}

	public static int convertion2to10(int simpleNumber){
		int binNumber = 0;
		int result;
		int i=1;
		int step = 1;
		while(simpleNumber!=0){
			result = simpleNumber%2;
			simpleNumber/=2;
			binNumber+=result*i;
			i*=10;
		}
		return binNumber;
	}
	static int con16ForAll(char val){
		if(val>='0'&&val<='9')
		return (int)val - '0';
		else
			return (int)val - 'A'+10;
	}

	static char convert10ForAll(int number){
		if(number>=0&& number<=9)
			return (char)(number+48);
		else
			return (char)(number-10+65);
	}

	public static int convertion16to10(String numberString){
		int length = numberString.length();
		int i;
		int numberResult = 0;
		int base = 1;
		for(i=length-1;i>=0;i--){
			numberResult+=con16ForAll(numberString.charAt(i))*base;
			base=base*16;
		}
		return numberResult;
	}
	public static String convertion10to16(int number){
		String s = "";
		while(number>0){
			s += convert10ForAll(number%16);
			number/=16;
		}
		StringBuilder stringTo = new StringBuilder();
		stringTo.append(s);
		return new String(stringTo.reverse());
	}

	public static void minElementMassiv(int[] massiv){
		int min,result;
		min = massiv[0];
		for(int i=1;i<massiv.length;i++){
			if(massiv[i]<=min){
				min=massiv[i];
			}
		}
		System.out.println(min);
	}

	public static void fibonachi(){
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

	public static void main(String args[]){
		System.out.println("Convert binary number to decimal:"+convertion10to2(110110111));
		System.out.println("Convert decimal number to binary:"+convertion2to10(52));
		System.out.println("Convert decimal number to binary:"+convertion16to10("10A"));
		System.out.println("Convert decimal number to binary:"+convertion10to16(282));

		System.out.println("Min element massiv");
		int[] a={12, 4, 6, 3};
		minElementMassiv(a);


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
		fibonachi();

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
