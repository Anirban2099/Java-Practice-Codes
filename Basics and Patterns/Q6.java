//Comparison of 2 no.s Conditional Statement

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        double x = sc.nextDouble();
        System.out.print("enter 2nd number: ");
        double y = sc.nextDouble();
        if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        else if(x<y){
            System.out.println(y+" is greater than "+x);

        }
        else{
            System.out.println(x+" = "+y+" both are equal num");
        }
    }
}
