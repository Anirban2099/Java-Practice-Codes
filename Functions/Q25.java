// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class Q25 {
    public static void GreaterNumber(double Gnum) {
        System.out.println("The Greater of 2 numbers: "+Gnum);
        return;
        
    }

    public static void main(String[] args) {
        double Gnum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double x= sc.nextDouble();
        System.out.println("Enter 2nd number: ");
        double y= sc.nextDouble();
        if(x>y){
             Gnum =Gnum+x;}
            else{
           Gnum=Gnum+y;}
          
          
           GreaterNumber(Gnum);



        }
        

    }
    

