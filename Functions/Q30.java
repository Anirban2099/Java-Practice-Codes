//Fibonacci Series using Functions

import java.util.*;
public class Q30 {
    public static void FibonacciSeries(int fbnc) {
        System.out.print("The Fibonacci Series is: "+fbnc);
        return;
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term: ");
        int n = sc.nextInt();
        System.out.print("Enter 1st term: ");
        int term1= sc.nextInt();
        System.out.print("Enter 2nd Term: ");
        int term2= sc.nextInt();
        


        for (int i = 1; i <= n; i++) {
            System.out.print(term1 + " ");
            int nextTerm = term1 + term2;
            term1 = term2;
            term2 = nextTerm;
            

    }

    FibonacciSeries(n);
    
}

}