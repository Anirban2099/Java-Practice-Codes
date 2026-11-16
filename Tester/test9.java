package Tester;
import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,result;

        System.out.println("Enter the 1st no: ");
        x = sc.nextDouble();
         System.out.println("Enter the 2nd no: ");
        y = sc.nextDouble();

        result = (x>y)? x:y;
        System.out.println("The largest number is: "+result);

    }
    
}
