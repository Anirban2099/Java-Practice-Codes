package Tester;

import java.util.Scanner;
public class t1{
    public static void main(String[] args) {
        double a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of a: ");
        a = sc.nextDouble();
        System.out.println("Enter the number of b:  ");
        b = sc.nextDouble();
        System.out.println("Enter the number of c: ");
        c =sc.nextDouble();
        System.out.println("Enter the number of d:  ");
        d = sc.nextDouble();

        double sum = a+b+c+d;
        double avg = sum/4;
        double product = a*b*c*d;
        double difference = a-b-c-d;
        double quotient = a/b/c/d;
        double remainder = a%b%c%d;
        double max = Math.max(Math.max(a,b),Math.max(c,d));
        double min = Math.min(Math.min(a,c),Math.min(b,d));

        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
        System.out.println("Product: "+product);
        System.out.println("Difference: "+difference);
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);        
       
    }
}