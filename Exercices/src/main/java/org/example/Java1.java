package org.example;

public class Java1 {
    static void sum() {
        int[] oddNumbers = new int[] {1, 3, 5, 7, 9};
        int sum = 0;
        for ( int num : oddNumbers) {
            sum = sum + num;
        }

        System.out.println(sum);
    }
}
