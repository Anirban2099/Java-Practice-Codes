package Tester;
import java.util.Scanner;

//Largest number

public class t7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        if(a>b && a>c){
            System.out.println("a is the largest "+a);
        }
        else if(b>a && b>c){
            System.out.println("b is the largest "+b);
        }
        else if(c>a && c>b){
            System.out.println("c is the largest "+c);
        }
        else{
            System.out.println("Invalid data");
        }
    }
    
}
