import java.util.Scanner;
public class Qx {
    public static void main(String[] args) {
        System.out.println("TCS NQT 2025");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int base = sc.nextInt();
        System.out.println("Enter number 2: ");
        int exponent = sc.nextInt();

        int result = 1;
        for (int i =1; i<=exponent ; i++){
            result = result * base;
        }
        System.out.print(result);
        sc.close();



        
    }
    
}
