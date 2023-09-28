//Functions to multiply 2 numbers and return product

import java.util.*;
public class Q21 {
    public static void PrintMyProduct(double product){
        System.out.println("The Sum is: "+product);
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd Number: ");
        double num2= sc.nextDouble();

        //Calling Function

        PrintMyProduct(num1*num2);

    }
    
}
