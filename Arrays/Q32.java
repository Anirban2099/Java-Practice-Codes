// Defining Arrays wth Scanner

package Arrays;

import java.util.*;
public class Q32 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        System.out.println("Enter the marks of Mathematics, Physics, Chemistry respectively");
        marks[0] = sc.nextInt(); 
        marks[1] = sc.nextInt(); 
        marks[2] = sc.nextInt(); 

        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        for (int i=0; i<3; i++){        
            System.out.println("The marks provided are : "+marks[i]);
        }
        
    }
    
}
