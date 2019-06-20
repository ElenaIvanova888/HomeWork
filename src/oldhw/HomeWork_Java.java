package oldhw; /**
 * Created by elenamilena on 2019-06-12
 */
import java.util.Scanner;

public class HomeWork_Java {
    public static void main(String[] args){
        System.out.println("Exercises with conversions");

        Scanner inputCelsius = new Scanner(System.in);

        System.out.println("Converrt Celsius to Fahrenheit.\nEnter value Celsius =");
        double C = inputCelsius.nextDouble();
        double Fahrenheit = 9.0/5.0*C+32;
        System.out.println("Fahrenheit:"+Fahrenheit);

        double Kelvin = C + 273.16;
        System.out.println("Kelvin:"+Kelvin);

        Scanner inputFahrenheit = new Scanner(System.in);

        System.out.println("\nConverrt Fahrenheit to Celsius.\nEnter value Fahrenheit =");
        double F = inputFahrenheit.nextDouble();
        double Celsius = 5.0/9.0*(F - 32);
        System.out.println("Celsius:"+Celsius);

        Scanner inputMeters = new Scanner(System.in);

        System.out.println("\nConvert meter to inches.\nEnter value meter =");
        double meters = inputMeters.nextDouble();
        double inches = meters*39.37;
        System.out.println("Inches:"+inches);
        double newMeter = inches/39.37;
        System.out.println(newMeter);

        Scanner inputMiles = new Scanner(System.in);

        System.out.println("\nConvert miles to kilometres.\nEnter value miles =");
        double miles = inputMiles.nextDouble();
        double kilometers = miles*1.609;
        System.out.println("Kilometres:"+kilometers);
        double newMiles = kilometers/1.609;
        System.out.println(newMiles);

        Scanner inputKilograms = new Scanner(System.in);

        System.out.println("\nConvert kilograms to pounds.\nEnter value kilograms =");
        double kilograms = inputKilograms.nextDouble();
        double pounds = kilograms*2.2046;
        System.out.println("Pounds:"+pounds);
        double newKilograms = pounds/2.2046;
        System.out.println(newKilograms);

        Scanner inputSpeed = new Scanner(System.in);

        System.out.println("\nConvert speed km/hr to mi/hr.\nEnter value km/hr =");
        double km = inputSpeed.nextDouble();
        double mi = km*0.6214;
        System.out.println("mi/hr :"+mi);
        double newKm = mi/0.6214;
        System.out.println(newKm);
    }
}
