import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Array to store the results
        int[] results = new int[T];

        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            results[t] = findMaxProduct(N);
        }

        // Print results
        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }

    private static int findMaxProduct(int N) {
        int maxProduct = -1;

        // Iterate through possible values of a
        for (int a = 1; a < N / 3; a++) {
            // Iterate through possible values of b
            for (int b = a + 1; b < N / 2; b++) {
                int c = N - a - b;

                // Check if it forms a Pythagorean triplet
                if (a * a + b * b == c * c) {
                    // Calculate the product
                    int product = a * b * c;
                    if (product > maxProduct) {
                        maxProduct = product;
                    }
                }
            }
        }

        return maxProduct;
    }
}
