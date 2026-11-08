package Tester;
import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("Enter value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();

        //Comparing boolean logic

        System.out.println("Is a > b ?");
        System.out.println(a>b);
        System.out.println("Is b > a ?");
        System.out.println(b>a);

        // Boolean value in variable
        boolean Result = a==b;
        boolean Result2 = a!=b;
        System.out.println(Result);
        System.out.println(Result2);

        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(!x);
        System.out.println(!y);
        System.out.println(x || y);

    }
}