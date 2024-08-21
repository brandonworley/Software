import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int a = 0;
        Inheritor i = new Inheritor();
        Inheritor2 i2 = new Inheritor2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("Do you want to send this to inheritor or inheritor2 (type 1 or 2)");
        while (a != 1 && a != 2) {
            try {
                a = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.next();
            }

            if (a == 1) {
                i.mystery(s);
                System.exit(0);
            } else if (a == 2){
                i2.mystery(s);
                System.exit(0);
            }
            System.out.println("Please type 1 or 2");
        }

    }
}