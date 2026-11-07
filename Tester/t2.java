package Tester;

import java.util.*;
public class t2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("Enter your age: ");
        a= sc.nextInt();
        System.out.println("Enter your sister's age");
        b = sc.nextInt();

        if (a>18 && b>18){
            System.out.println("You and your sister are eligible to vote");
        }
        else if(a<18 && b<18){
            System.out.println("You and your sister are not eligible to vote");
        }
        else if(a>18 && b<18){
            System.out.println("You can vote but your sister cannot");
        }
        else if(a<18 && b>18){
            System.out.println("You cant vote but your sister can");
        }
        else {
            System.out.println("Invalid data input!");
        }

    }
    
}
