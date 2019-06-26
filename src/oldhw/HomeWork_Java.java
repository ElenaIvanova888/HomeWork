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

    static double Fahrenheit(double Celvin){
        return 9.0/5.0*Celvin+32;
    }
    static double Kelvin(double Celvin){
         return Celvin + KELVINES;
    }
    static double CelsiusConverting(double Fahrenheit){
         return 5.0/9.0*(Fahrenheit - 32);
    }
    static double InchesConverting(double meters){
        return meters*INCHESMETERS;
    }
    static double NewMeterConverting(double inchesNew){
        return inchesNew/INCHESMETERS;
    }
    static double KilometersConverting(double miles){
        return miles*KILOMETERSMILES;
    }
    public static double MilesConverting(double kilometers){
        return kilometers/KILOMETERSMILES;
    }
    public static double PoundConverting(double kilograms){
        return kilograms*POUNDSKILOGRAMS;
    }
    public static double KilogramsFromPoundConverting(double pounds){
       return pounds/POUNDSKILOGRAMS;
    }
    public static double MilesConvertingForKM(double km){
         return km*KILOMETERSNMILESPERSECONDS;
    }
    public static double NewKMConverting(double mi){
        return mi/KILOMETERSNMILESPERSECONDS;
    }


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Exercises with conversions");
        System.out.println("Converrt Celsius to Fahrenheit.\nEnter value Celsius =");

        double C = scanner.nextDouble();

        System.out.println("Fahrenheit:"+Fahrenheit(C));
        System.out.println("Kelvin:"+Kelvin(C));


        System.out.println("\nConverrt Fahrenheit to Celsius.\nEnter value Fahrenheit =");
        double F = scanner.nextDouble();
        System.out.println("Celsius:"+CelsiusConverting(F));

        System.out.println("\nConvert meter to inches.\nEnter value meter =");
        double meters = scanner.nextDouble();
        System.out.println("Inches:"+InchesConverting(meters));
        System.out.println(NewMeterConverting(InchesConverting(meters)));


        System.out.println("s\nConvert miles to kilometres.\nEnter value miles =");
        double miles = scanner.nextDouble();
        System.out.println("Kilometres:"+KilometersConverting(miles));
        System.out.println(MilesConverting(KilometersConverting(miles)));

        System.out.println("\nConvert kilograms to pounds.\nEnter value kilograms =");
        double kilograms = scanner.nextDouble();
        System.out.println("Pounds:"+PoundConverting(kilograms));
        System.out.println(KilogramsFromPoundConverting(PoundConverting(kilograms)));

        System.out.println("\nConvert speed km/hr to mi/hr.\nEnter value km/hr =");
        double km = scanner.nextDouble();
        System.out.println("mi/hr :"+MilesConvertingForKM(km));
        System.out.println(NewKMConverting(MilesConvertingForKM(km)));
    }

}
