import java.util.Scanner;
public class Substrings {

    // .substring() is used to extract a portion of a string
    // .substring(start,end)

    public static void main(String[] args) {
        while (true) {

            Scanner scanner = new Scanner(System.in);

            String email = "";

            System.out.print("enter your email: ");
            email = scanner.nextLine();

            if (email.contains("@")) {
                String username = email.substring(0, 6); // 6 is exclusive!! its a bound
                String betterUsername = email.substring(0, email.indexOf("@"));
                String domain = email.substring(email.indexOf("@") + 1); // takes everything from the first character post-@ and further

                System.out.println(betterUsername);
                System.out.println(domain);
                scanner.close();
                break;

            } else {
                System.out.println("email must contain an @ sign!");
            }
        }


    }}
