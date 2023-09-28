//Average of 3 nos using Functions 

import java.util.Scanner;
public class Q23 {
    public static void PrintAverage(double average) {
        System.out.println("The average of the 3 nos is: "+average);
        return;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double x= sc.nextInt();
         System.out.print("Enter 2nd number: ");
        double z = sc.nextInt();
         System.out.print("Enter 3rd number: ");
        double y= sc.nextInt();

        //Calling Function

        PrintAverage((x+y+z)/3);
    }
    
}
