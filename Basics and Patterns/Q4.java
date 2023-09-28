// Voting age conditional statement

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your Age: ");
int age = sc.nextInt();
if(age>= 18)
{
    System.out.println("Eligible to Vote");
}
    else if( age<= 18)
    {
        System.out.println("Not eligible to vote");
    }
 else{
    System.out.println("Invalid Data");
 }   

        
    }
}
