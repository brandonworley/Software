import java.util.Scanner;

public class Demo
{

    public static void main (String[] args)
    {
        int a = 0;
        Inheritor i = new Inheritor();
        Inheritor2 i2 = new Inheritor2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("Do you want to send this to inheritor or inheritor2 (type 1 or 2)");
        try
        {
            a = sc.nextInt();
        }
        catch (Exception e)
        {
            a = 1;
        }
        
        if (a == 1)
        {
            i.mystery(s);
        }
        else
        {
            i2.mystery(s);
        }
        
    }
}