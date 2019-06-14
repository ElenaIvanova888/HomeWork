/**
 * Created by elenamilena on 2019-06-12
 */

public class Equations {
    public static void main(String[] args) {
        System.out.println("Exercises");
        double x = 0.6;
        double a = 1.1*Math.exp(-x)+Math.abs(Math.cos(Math.sqrt(x*Math.PI)))-3.0/8.0;
        System.out.println("Exercise 9 "+a);

        double b = (1.0/3.0)*Math.sqrt(Math.abs(Math.sin(x)))*Math.cbrt(Math.exp(0.12*x));
        System.out.println("Exercise 10 "+b);

        double c = 2*x*Math.PI-Math.abs(Math.sin(Math.sqrt(10.5*x)))*(1/((1.0/7.0)*Math.cbrt(Math.pow(x,2))));
        System.out.println("Exercise 11 "+c);

        double d = Math.log(Math.sqrt(Math.abs(2-x))+1.2)*(1/(2+Math.exp(-x)))+Math.cbrt(2/x);
        System.out.println("Exercise 12 "+d);

        double e = Math.pow(Math.exp(-2+x),1.0/5.0)*1/Math.sqrt(Math.pow(x,2)+Math.pow(x,4)+Math.log(Math.abs(x-3.14)));
        System.out.println("Exercise 13 "+e);

        double f = (Math.sqrt(Math.pow(Math.sin(x/2),3))+Math.cbrt(Math.exp(1.3*x)+Math.exp(-1.3*x)))*1/Math.abs(x+5/0.2/0);
        System.out.println("Exercise 14 "+f);

        double g = (Math.abs(x*Math.log(x)-4)*Math.sqrt(x))*1/Math.pow(Math.exp(4*x-1),1.0/5.0);
        System.out.println("Exercise 15 "+g);

        double h = Math.cbrt(Math.exp(2*x)*Math.sqrt(x)-((x+1.0/3.0)/x))*Math.abs(Math.cos(2.5*x));
        System.out.println("Exercise 16 "+h);

        double i = (Math.pow(x,3)/3)-Math.exp(x)*Math.log(Math.abs(Math.pow(1.3,3)+Math.pow(x,3)))+(4.0/3.0);
        System.out.println("Exercise 17 "+i);

        double j = (Math.abs(7.2-10*x)/Math.cbrt(Math.pow(x,2)+Math.exp(x)))*Math.atan((4*(x/3))/Math.sqrt(Math.pow(1.1,3)+Math.pow(x,2)));
        System.out.println("Exercise 18 "+j);

        double k = Math.acos(Math.tan(5*x/Math.PI))+(Math.pow(x,3.2))/28;
        System.out.println("Exercise 19 "+k);

        double l = (Math.cbrt(Math.pow(Math.log(x),2))+Math.tan(Math.cos(x*Math.PI)))*Math.abs(Math.log(x/10.5)+(1.0/3.0));
        System.out.println("Exercise 20 "+l);

        double m = (Math.pow(Math.log10(x),1.0/4.0)+Math.acos(x+3))*1/Math.abs(x+2*Math.pow(x,2));
        System.out.println("Exercise 21 "+m);

        double n = Math.asin(Math.log(x)/(Math.pow(x,2)+5*x+1))-Math.pow(x,3.2)/28;
        System.out.println("Exercise 22 "+n);

        double o = Math.acos(Math.tan((5*x/Math.PI)))+Math.pow(x,5.7)/23;
        System.out.println("Exercise 23 "+o);

        double p = Math.atan(Math.abs(8.3-21*Math.pow(x,2)-0.8*x)/Math.cbrt(2.5+(1/Math.pow(x,2))));
        System.out.println("Exercise 24 "+p);

        double r = Math.pow(Math.log(Math.acos(Math.abs(Math.pow(x,3.4)+2.5*Math.pow(x,1.2)-0.7)/Math.pow(Math.exp(2.5*x),1.0/3.0))),1.0/4.0)+1;
        System.out.println("Exercise 25 "+r);

        double s = Math.log(Math.sin(x))+2*Math.exp(x)+2*Math.cos(Math.abs(x))+2;
        System.out.println("Exercise 25 "+s);
    }

}
