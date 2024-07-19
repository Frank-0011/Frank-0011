import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("pleas enter your age: ");
        x = input.nextDouble();

        Boolean A = (x < 18);
        if (A) {
            System.out.println("you are under age, soo sorry");

        } else{
            System.out.println("you can inter in our page ;] ");

        }
    }
}
