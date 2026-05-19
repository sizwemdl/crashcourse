import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        Random randy = new Random();
        Scanner scanster = new Scanner(System.in);

        double score;
        boolean decide;

        System.out.println("press enter to begin!");
        scanster.nextLine();

        score = randy.nextDouble(1,10.1);
        decide = randy.nextBoolean();

        System.out.println("you scored a " + score + "!");
        if (decide) {
            System.out.println("Yup.");
        } else {
            System.out.println("Nope.");
        }

        scanster.close();

    }
}
