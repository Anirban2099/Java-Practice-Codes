package Arrays;

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        
        int[] array = new int[length];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        
        boolean isAscending = true;
        for (int i = 1; i < length; i++) {
            if (array[i] < array[i - 1]) {
                isAscending = false;
                break;
            }
        }
        
        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}


    

