//Odd or Even Conditional Statement
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    if (num % 2 ==0)
    {
        System.out.println(num+" is Even");
    }
    else
    {
        System.out.println(num+" is Odd");
    }
    }
}
