import java.util.Scanner;

public class ConnectingTowns {
    private static final int MOD = 1234567;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();

        while (t-- > 0) {
            // Read the number of towns
            int n = sc.nextInt();

            // Read the routes between towns and calculate total routes
            long totalRoutes = 1;
            for (int i = 0; i < n - 1; i++) {
                int routes = sc.nextInt();
                totalRoutes = (totalRoutes * routes) % MOD;
            }

            // Print the result for this test case
            System.out.println(totalRoutes);
        }

        sc.close();
    }
}
