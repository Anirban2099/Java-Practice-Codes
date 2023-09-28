import java.util.*;
public class Q3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        double a= sc.nextDouble();
        System.out.println("Enter breadth of the rectangle: ");
        double b= sc.nextDouble();
        
        double c= 2*(a+b);
        double d =a*b;

        System.out.println("The area of the rectangle is: "+d);
        System.out.println("The perimeter of the rectangle is: "+c);





    }
    
}
