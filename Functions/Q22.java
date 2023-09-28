//Functions Calculate Factorial

import java.util.Scanner;
public class Q22 {
  public static void PrintFactorial(int n){
    int factorial =1;

    for(int i =n; i>=1; i--){
        factorial = factorial*i;

    }

    System.out.println(factorial);
    return;
}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter integer: ");
    int n = sc.nextInt();

    PrintFactorial(n);

  }
}


