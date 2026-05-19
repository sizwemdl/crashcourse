import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {

        Scanner mathscan = new Scanner(System.in);

        /*
        System.out.println(Math.PI);
        System.out.println(Math.E);
        Math.abs() turns a negative number into a pure vector
        Math.sqrt() for a square root
        Math.round() rounds to the nearest whole integer, but to force round up use Math.ceil(). Math.floor() forces rounding down
        Math.max(a,b) returns the bigger value, while Math.min() does the opposite
        */

        /*
        double result;
        double a = 0;
        double b = 0;

        System.out.println("what's the number?");
        a = mathscan.nextDouble();

        System.out.println("and what power would you like to raise it to?");
        b = mathscan.nextDouble();

        result = Math.pow(a,b);
        System.out.println(a + " to the power of " + b + " is " + result + "!" );
        */

        double circ;
        double area;
        double volume;

        System.out.println("what's the radius?");
        double radius = mathscan.nextDouble();

        circ = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4/3) * Math.PI * Math.pow(radius, 3);

        System.out.printf("%15s: %10.1f centimetres!\n", "circumference", circ);
        System.out.printf("%15s: %10.1f centimetres squared!\n", "area", area);
        System.out.printf("%15s: %10.1f centimetres cubed!\n", "volume", volume);

        mathscan.close();
    }
}
