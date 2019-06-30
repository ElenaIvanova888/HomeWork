package oldhw; /**
 * Created by elenamilena on 2019-06-12
 */
import java.util.Scanner;


public class HomeWork_Java {

    public static final double KILOMETERSNMILESPERSECONDS = 0.6214;
    public static final double POUNDSKILOGRAMS = 2.2046;
    public static final double KILOMETERSMILES = 1.609;
    public static final double INCHESMETERS = 39.37;
    public static final double KELVINES = 273.16;

    static double fahrenheit(double Celvin){
        return 9.0/5.0*Celvin+32;
    }
    static double kelvin(double Celvin){
         return Celvin + KELVINES;
    }
    static double celsiusConverting(double Fahrenheit){
         return 5.0/9.0*(Fahrenheit - 32);
    }
    static double inchesConverting(double meters){
        return meters*INCHESMETERS;
    }
    static double newMeterConverting(double inchesNew){
        return inchesNew/INCHESMETERS;
    }
    static double KilometersConverting(double miles){
        return miles*KILOMETERSMILES;
    }
    public static double milesConverting(double kilometers){
        return kilometers/KILOMETERSMILES;
    }
    public static double poundConverting(double kilograms){
        return kilograms*POUNDSKILOGRAMS;
    }
    public static double kilogramsFromPoundConverting(double pounds){
       return pounds/POUNDSKILOGRAMS;
    }
    public static double milesConvertingForKM(double km){
         return km*KILOMETERSNMILESPERSECONDS;
    }
    public static double newKMConverting(double mi){
        return mi/KILOMETERSNMILESPERSECONDS;
    }


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Exercises with conversions");
        System.out.println("Converrt Celsius to Fahrenheit.\nEnter value Celsius =");

        double C = scanner.nextDouble();

        System.out.println("Fahrenheit:"+fahrenheit(C));
        System.out.println("Kelvin:"+kelvin(C));


        System.out.println("\nConverrt Fahrenheit to Celsius.\nEnter value Fahrenheit =");
        double F = scanner.nextDouble();
        System.out.println("Celsius:"+celsiusConverting(F));

        System.out.println("\nConvert meter to inches.\nEnter value meter =");
        double meters = scanner.nextDouble();
        System.out.println("Inches:"+inchesConverting(meters));
        System.out.println(newMeterConverting(inchesConverting(meters)));


        System.out.println("s\nConvert miles to kilometres.\nEnter value miles =");
        double miles = scanner.nextDouble();
        System.out.println("Kilometres:"+KilometersConverting(miles));
        System.out.println(milesConverting(KilometersConverting(miles)));

        System.out.println("\nConvert kilograms to pounds.\nEnter value kilograms =");
        double kilograms = scanner.nextDouble();
        System.out.println("Pounds:"+poundConverting(kilograms));
        System.out.println(kilogramsFromPoundConverting(poundConverting(kilograms)));

        System.out.println("\nConvert speed km/hr to mi/hr.\nEnter value km/hr =");
        double km = scanner.nextDouble();
        System.out.println("mi/hr :"+milesConvertingForKM(km));
        System.out.println(newKMConverting(milesConvertingForKM(km)));
    }

}
