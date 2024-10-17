import java.util.Scanner;

public class Addition {

    
    public static void main(String[] args) {

        int a,b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        System.out.println("Enter the third number");
        c = sc.nextInt();
        
        if (a > b && a > c)
       {

        System.out.print("A is Largest" + a);
        System.out.print("A " );
       }

        else if (b > a && b > c)
        {
            System.out.print("B is Largest" + b);
            System.out.print("B " );
        }
        else
        {
            System.out.print("C is Largest" + c);
        }
    }
}