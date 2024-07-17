import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a = "this text ";
        String b = "will be ";
        String c = "conect to this text ";

        System.out.println(a + b + c);
        System.out.println("if you see that text write 1 number:");
        int x, y, g, h;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        System.out.println("ok, one more number PLS");
        y = input.nextInt();
        System.out.println("I'll promeis you this is the last one  ;]");
        g = input.nextInt();
        System.out.println("nice, but i need one more  ;[");
        h = input.nextInt();
        System.out.println("thank you soooooooooooo much");
        int i = x + y + + g + h;

        String s, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("i can tell you every thing that you write down here XD");
        s = sc.nextLine();
        System.out.println(s);
        System.out.println("and also i can connect you new text to last one");
        k = sc.nextLine();
        String l = s + " " + k;
        System.out.println(l);
        System.out.println("and there is your before numbers");
        System.out.println(i);

    }

}