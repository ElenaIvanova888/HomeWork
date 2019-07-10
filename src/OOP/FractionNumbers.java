package OOP;

import javax.xml.stream.FactoryConfigurationError;

public class FractionNumbers {
	public int numerator;
	public int denominator;

	public FractionNumbers(){

	}

	public FractionNumbers(int numerator,int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator(){
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator(){
		return  denominator;
	}

	public void setDenominator(int denominator){

		this.denominator = denominator;
	}


	public FractionNumbers plus(FractionNumbers fractionTwo){
		FractionNumbers fractionNumbers = new FractionNumbers();
		fractionNumbers.numerator = this.numerator*fractionTwo.denominator+fractionTwo.numerator*this.denominator;
		fractionNumbers.denominator = this.denominator*fractionTwo.denominator;
		return fractionNumbers;
 	}

 	public FractionNumbers subtract(FractionNumbers fractionTwo){
		FractionNumbers negativeFraction = new FractionNumbers(-fractionTwo.numerator,fractionTwo.denominator);
		return plus(negativeFraction);
	}

	public FractionNumbers multi(FractionNumbers fractionTwo){
		FractionNumbers fractionNumbers = new FractionNumbers();
		fractionNumbers.numerator= this.numerator*fractionTwo.numerator;
		fractionNumbers.denominator= this.denominator*fractionTwo.denominator;
		return fractionNumbers;
	}
	public FractionNumbers divide(FractionNumbers fractionTwo){
		return multi(fractionTwo.invert());
	}

	public FractionNumbers invert(){
		FractionNumbers inverted = new FractionNumbers(denominator,numerator);
		if(inverted.denominator<0){
			inverted.denominator = -inverted.denominator;
			inverted.numerator = -inverted.numerator;
		}
		return inverted;
	}



	@Override
	public String toString(){

		return "Fraction Number :"+
				"numerator "
				+numerator+",denominator"
				+denominator;
	}
}
