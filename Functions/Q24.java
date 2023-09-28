// Write a function to print the sum of all odd numbers from n to m .

import java.util.*;
public class Q24 {
    public static void OddSum(int sum) {
        System.out.println("The sum of odd nos: "+sum);
        return;
        
    }
    

    public static void main(String[] args) {
        int sum=0;
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter starting number: ");
    int n= sc.nextInt();
    System.out.print("Enter last number: ");
    int m= sc.nextInt();
    for (int i=n; i<=m; i++){
        if(i%2 !=0){
            sum= sum+i;
                  }
        }
        OddSum(sum) ;

    }
}   






