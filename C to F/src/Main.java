import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double c, f;
        System.out.println("pleas enter your C number: ");
        Scanner input = new Scanner(System.in);
        c = input.nextDouble();
        f = (c * 1.8) + 32;
        System.out.println("this is your F number: " + f);

    }

}