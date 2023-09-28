// Write a function that calculates the Greatest Common Divisor of 2 numbers

import java.util.*;
public class Q29 {
    public static void CalculatingGCD(double gcd) {
        System.out.println("The Greatest Common Diviser is: "+gcd);
        return;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number; ");
        double n1 = sc.nextDouble();
        System.out.println("Enter 2nd number: ");
        double n2= sc.nextDouble();

        double gcd = Math.min(n1, n2);
        while (gcd > 0) {
            if (n1 % gcd == 0 && n2 % gcd == 0) {
                break;
            }
            gcd--;
        }
 
        CalculatingGCD(gcd);
    }

    }
    

