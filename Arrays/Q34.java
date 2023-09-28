// Finding a value in Array (Linear Search)

package Arrays;

import java.util.*;
public class Q34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[]= new int[size];

        //Input   
         
         for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
         }

         System.out.println("Enter value u want to find: ");
         int valu = sc.nextInt();

         //Output

         for(int i=0; i<size; i++){
           if(numbers[i] == valu) {
            System.out.println(" Value found at index: "+i);
           }
         }

         
    }
}
