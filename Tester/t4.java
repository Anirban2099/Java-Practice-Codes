package Tester;
import java.util.*;

public class t4 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int m,n,x,y;

    //Increment 
    System.out.println("Enter 1st number: ");
    m= sc.nextInt();
    int res = m++;
    System.out.println("Increment value is: " +m);

    // Pre increment 
    System.out.println("Enter the 2nd number: ");
    n= sc.nextInt();
    int res2= ++n;
    System.out.println("Pre increment value is: " +n);

      // Decrement 
    System.out.println("Enter the 3rd number: ");
    x= sc.nextInt();
    int res3= x--;
    System.out.println("Pre increment value is: " +x);

      // Pre Decrement
    System.out.println("Enter the 4th number: ");
    y= sc.nextInt();
    int res4= --y;
    System.out.println("Pre increment value is: " +y);

}   } 

