import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double f, c;
        Scanner input = new Scanner(System.in);

        System.out.print("pleas enter your fahrenheit number: ");
        f = input.nextDouble();

        c = ((f - 32) * 5) / 9;

        System.out.print("so this is your centigrade number: ");
        System.out.println(c);


    }
}