/*   *****
     *   *   Pattern Code 2
     *   *
     *   *
     *****                */

import java.util.*;
public class Q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter for i: ");
        int n = sc.nextInt();

        System.out.print("Enter for j: ");
        int m = sc.nextInt();

        //OuterLoop
        for( int i=1; i<=n; i++){
            //InnerLoop
            for(int j=1; j<=m; j++){

                if( i==1 || j==1 || i==n || j==m){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
        }
        System.out.println();
    }
}
}
