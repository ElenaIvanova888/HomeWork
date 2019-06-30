package oldhw; /**
 * Created by elenamilena on 2019-06-12
 */
import java.util.Scanner;

public class HomeWork_GeneralApplications {

    public static Scanner scanner = new Scanner(System.in);
    public static double multipleChoice(int a, double b){
        return (double) a - (double)(1.0/4.0)*b;
    }
    public static double conversions(double x, double y){
        return  Math.round(((y-x)/x) * 100);
    }
    public static void convertingSeconds(double seconds){
        double minutes = seconds/60.0;
        double hours = minutes/60.0;
        double days = seconds/86400.0;
        double newSecondsFromMinutes = minutes*60.0;
        double newSecondsFromHours = Math.round(hours*3600.0);
        double newSecondsFromDays = Math.round(days*86400.0);


        System.out.println("Minutes:"+minutes);
        System.out.println("Hours:"+hours);
        System.out.println("Days:"+days);
        System.out.println("Reversed seconds "+newSecondsFromMinutes+" and "+newSecondsFromHours+" and "+newSecondsFromDays);
    }
    public static void convertinTIme(int currentYear, int birthYear){
        int years, weeks, daysAll,hoursAll,minutesAll, secondsAll;

        years=currentYear-birthYear;
        weeks=years*52;
        daysAll = weeks*7;
        hoursAll=daysAll*24;
        minutesAll=hoursAll*60;
        secondsAll=minutesAll*60;

        System.out.println("\nYears "+ years);
        System.out.println("\nWeeks "+weeks);
        System.out.println("\nDays "+daysAll);
        System.out.println("\nhours "+hoursAll);
        System.out.println("\nhours "+minutesAll);
        System.out.println("\nMinutes "+secondsAll);

    }
    public static void main(String[] args){

        System.out.println("Exercises with time");

        System.out.println("Converrting seconds.\nEnter value seconds =");
        double seconds = scanner.nextDouble();
        convertingSeconds(seconds);

        int currentYear = 2019;
        int birthYear = 1996;
        convertinTIme(currentYear,birthYear);

        System.out.println("Exercises with conversions");

        System.out.println("Enter value x: ");
        double x = scanner.nextDouble();

        System.out.println("Enter value y: ");
        double y = scanner.nextDouble();

        System.out.println(conversions(x,y));

        System.out.println("Exercises with Multiple choice test score");
        int a = 6;
        double b = 3.4;
        System.out.println(multipleChoice(a,b));
    }
}
