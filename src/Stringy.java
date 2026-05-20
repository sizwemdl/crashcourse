import java.util.Scanner;
public class Stringy {
    public static void main(String[] args) {

        /*
        String name = "name nameson";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();  // removes whitespace
        name = name.replace("o", "x");

        System.out.println(name);

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name DOESN'T contain any spaces");
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
        */

        Scanner pWord = new Scanner(System.in);
        String password = "";
        String caseSens = "";
        String attempt = "";

        System.out.println("enter a password!");
        password = pWord.nextLine();

        while ( !(caseSens.equals("y")) && !(caseSens.equals("n")) ) {
            System.out.println("would you like it to be case-sensitive? (y/n)");
            caseSens = pWord.nextLine();
        }

        if (caseSens.equals("y")) {
            while (!attempt.equals(password)) {
                System.out.println("enter your password!");
                attempt = pWord.nextLine();
            }
            System.out.println("that's right!");
        }

        else if (caseSens.equals("n")) {
            while (!attempt.equalsIgnoreCase(password)) {
                System.out.println("enter your password!");
                attempt = pWord.nextLine();
            }
            System.out.println("that's right!");
        }

        pWord.close();
    }
}
