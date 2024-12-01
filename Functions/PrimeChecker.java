import java.math.BigInteger;
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        // Input using Scanner
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Create BigInteger instance
        BigInteger number = new BigInteger(input);

        // Check if the number is prime
        if (number.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
