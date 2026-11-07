import java.util.Scanner;
public class Qy {
    public static void main(String[] args) {
        System.out.println("TCS NQT 2025");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int m = sc.nextInt();

        int hcf = findHcf(n,m);
        System.out.println(hcf);
        
        sc.close();
    }

    public static int findHcf(int a , int b){
        if (b==0)
            return a;
            else

            return findHcf(b, a%b);
    }
    
}
