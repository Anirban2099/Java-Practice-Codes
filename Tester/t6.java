package Tester;
import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
// Voting Eligibilty        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age<18){
            System.out.println("You are not eligible to vote");
        }
            else if (age >= 18){
                System.out.println("You are eligible to vote");
            }
            else{
                System.out.println("Invalid data");
            }
//Even & Odd
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Its an Even number");
        }
        else if(num%2 !=0){
            System.out.println("Its an Odd number");
        }
        else{
            System.out.println("Invalid data");
        }
//Positive or Negative Number
        if(num<0){
            System.out.println("The number is -ve");
        }
        else if(num>=0){
            System.out.println("The number is +ve");
        }
        else{
            System.out.println("Invalid data");
        }
        
    }
    
}
