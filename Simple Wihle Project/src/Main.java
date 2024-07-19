public class Main {

    public static void main(String[] args) {

        int x=3 , y = 2;
        while(y <= 10){
            y++; /*if it's here, means printLn will be start from3 */
            System.out.println(y);
            x++;

        };
        switch (x){
            case 12:
                System.out.println("12, that's true");
                break;

            default:
                System.out.println("your number is wrong, its: " + x);
        }
        System.out.println(y);
    }

}