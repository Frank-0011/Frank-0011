import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String n;
        Scanner input = new Scanner(System.in);
        System.out.println("pleas enter your name: ");
        n = input.nextLine();
        System.out.println("Welcome " + n);

        int x;
        System.out.println("how many Stars do you want?");
        x = input.nextInt();

        int y = 0;
        while (y <= x) {
            System.out.print("*");
            y++;}

        System.out.println(" ");

            int m = 0;
            String j;
            Scanner sc = new Scanner(System.in);

            System.out.println("do you want to write your name instead of stars? write yes or no!");
            j = sc.nextLine();
            if (Objects.equals(j, "yes")) {
                System.out.println("for sure, here you are");
                while (m <= x) {
                    System.out.print(n + " ");
                    m++;
                }

            } else if (Objects.equals(j, "no")) {
                System.out.println("you made my sad ;[");

            } else {
                System.out.println("I can't understand what you wort, I said: Yes or No");
            }

        }

    }
