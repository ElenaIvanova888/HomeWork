package OOP;

public class Main {
	public static void main(String[] args){
		FractionNumbers fractionNumber1 = new FractionNumbers(2, 4 );
		FractionNumbers fractionNumber2 = new FractionNumbers(4,3);
		FractionNumbers plusResult = fractionNumber1.plus(fractionNumber2);
		FractionNumbers subtractResult = fractionNumber1.subtract(fractionNumber2);
		FractionNumbers multiplyResult = fractionNumber1.multi(fractionNumber2);
		FractionNumbers divideResult = fractionNumber1.divide(fractionNumber2);
		System.out.println(plusResult+""+subtractResult+""+multiplyResult+""+divideResult);
	}
}
