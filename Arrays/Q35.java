package Arrays;

import java.util.*;
public class Q35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[]= new int[size];

        //Input   
         
         for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
         }

         //Output

         for(int i=0; i<size; i++){
            System.out.println("The elements are: "+numbers[i]);
         }

         
    }
}