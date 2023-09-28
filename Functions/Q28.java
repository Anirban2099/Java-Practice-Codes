/* 	Two numbers are entered by the user, x and n. 
Write a function to find the value of one number raised to the power of another i.e. x^n.	*/ 


import java.util.*;
public class Q28 {
    public static void CalculatingPower(double power) {
        System.out.println("The Power Answer is: "+power);
        return;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        double x = sc.nextDouble();
        System.out.println("Enter the power of the number: ");
        double n = sc.nextDouble();

        double power = Math.pow(x,n);

        CalculatingPower(power);
        
    }
    
}
