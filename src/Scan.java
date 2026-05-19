import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        double area = 0;
        double height = 0;
        double length = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("how tall is your rectangle?");
        height = scanner.nextDouble();

        System.out.println("how wide is your rectangle?");
        length = scanner.nextDouble();

        area = height * length;
        System.out.println("your rectangle has an area of " + area + "units squared!");

        scanner.close();

    }
}
