/*  *
    **    Pattern 3 Right Angled Traingle
    ***
    ****
    *****                                           */

import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
