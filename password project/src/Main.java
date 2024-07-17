import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int p, s;
        System.out.println("pleas enter your password: ");
        Scanner input = new Scanner(System.in);
        p =input.nextInt();
        System.out.println("pleas enter your password again: ");
        s = input.nextInt();
        if(p == s){
            System.out.println("that's True!");
        }else {
            System.out.println("That's wrong!");
        }

    }
}