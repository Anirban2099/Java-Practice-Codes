//Switch Condition

import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter button no: ");
        int button = sc.nextInt();
        switch (button){
            case 1: System.out.println("Turned on the lights");
            break;
            case 2: System.out.println("Turned on the Fan");
            break;
            case 3: System.out.println("Turned on the PC");
            break;
            case 4: System.out.println("Turned on the AC");
            break;
            default : System.out.println("Power Off");

        }

    }
    
}
