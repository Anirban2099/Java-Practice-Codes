//Functions to add 2 numbers and return sum

import java.util.*;
public class Q20 {
    public static void PrintMySum(double sum){
        System.out.println("The Sum is: "+sum);
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd Number: ");
        double num2= sc.nextDouble();

        //Calling Function

        PrintMySum(num1+num2);

    }
    
}
