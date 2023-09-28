// Finding Max and Min integers from Array 

package Arrays;

import java.util.*;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        
        System.out.println("Enter the elements:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

    

