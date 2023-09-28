//Finding table of a number using For loop

import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose table u want to find: ");
        int i= sc.nextInt();
        
        for( int j=1; j<=10; j++){
            System.out.println(i+"X"+j+" = "+i*j);
        }
    }
    
}
