//	Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class Q26 {
    public static void CircleCircumference(double cfc) {
        System.out.print("The Circumference of the circle is: "+cfc);
        return;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        //Formula 
        double cfc = 2*Math.PI*r;
        CircleCircumference(cfc);
    }

    
}
