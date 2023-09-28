//Function - Print out the name

import java.util.Scanner;
public class Q19 {
    public static void PrintMyName(String name) {           //CamelCase for Java
        System.out.println(name);   
        return;                              
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= sc.next();
        
        PrintMyName(name);

    }
    
}
