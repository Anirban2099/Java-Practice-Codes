package Tester;
import java.util.Scanner;

//Ternary operator

public class t5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;
        System.out.println("Enter value of 1st number: ");
        x = sc.nextInt();
        System.out.println("Enter value of 2nd number: ");
        y= sc.nextInt();

        int result = (x>y)? x:y;
        System.out.println(result);

        int result1 =(0==0)? x:y;
        System.out.println(result1);
    
    //Alternate voting code using ternary condition
    System.out.println("Enter yoru age: ");
    int age = sc.nextInt();
    
    String vote = (age >= 18)? "Eligible" : "Not Eligible";
    System.out.println("Voting Status: "+vote);
    
}
    
}
