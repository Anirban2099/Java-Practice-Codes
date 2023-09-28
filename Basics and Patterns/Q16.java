/*                *
                 **  Pattern 5 Alternate5 90 Triangle 
                ***
               ****
              *****                                                              */

import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    } 
}
}