//Adding string value or names in Array

package Arrays;

import java.util.Scanner;
public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of names: ");
        int size = sc.nextInt();
        String names[] = new String[size];

     //Input

     for(int i=0; i<size; i++){
        names[i] = sc.next();
     }
     //output
     
     for(int i=0; i<names.length; i++){
        System.out.println("Name "+(i+1)+" is : "+ names[i]);
     }


    }
    
}
