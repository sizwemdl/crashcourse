public class PrintF {
    public static void main(String[] args){

        // printf() is a method used to format output, kinda works like C

        // %[flags][width][.precision][specifier-character]

        /*
        String name = "spunch";
        char firstletter = 's';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("hello %s\n", name); // don't forget the new lines!
        System.out.printf("first char %c\n", firstletter);
        System.out.printf("number %d\n", age);
        System.out.printf("other number %.1f\n", height);
        System.out.printf("bool  bool: %b\n", isEmployed);
        */

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;

        // + outputs a plus
        // , puts commas in the thousands
        // ( encloses negative numbers in brackets rather than displaying the - symbol
        // space displays blank space if positive and a minus if negative

        System.out.printf("% ,.2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("%.2f\n", price3);

        // 0 = zero padding
        // number = right justify
        // neg number = left justify

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

    }

}
