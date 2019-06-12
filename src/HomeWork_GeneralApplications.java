/**
 * Created by elenamilena on 2019-06-12
 */
import java.util.Scanner;

public class HomeWork_GeneralApplications {

    public static void main(String[] args){

        System.out.println("Exercises with time");

        Scanner inputSeconds = new Scanner(System.in);

        System.out.println("Converrting seconds.\nEnter value seconds =");
        double seconds = inputSeconds.nextDouble();
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

        int currentYear = 2019;
        int birthYear = 1996;
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

        System.out.println("Exercises with conversions");

        Scanner inputX = new Scanner(System.in);

        System.out.println("Enter value x: ");
        double x = inputX.nextDouble();

        Scanner inputY = new Scanner(System.in);

        System.out.println("Enter value y: ");
        double y = inputY.nextDouble();

        double percent = ((y-x)/x) * 100;
        System.out.println(Math.round(percent));

        System.out.println("Exercises with Multiple choice test score");
        int a = 6;
        double b = 3.4;
        double c = (double) a - (double)(1.0/4.0)*b;
        System.out.println(c);
    }
}
