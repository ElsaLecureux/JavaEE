package org.example;

public class Java11 {
    static int fibonacciNumber(int num) {
        if(num <= 1){
            return num;
        } else {
            return fibonacciNumber(num- 2) + fibonacciNumber(num - 1);
        }
    }
    public static void main(String[] args) {
        int number = 0;
        int number3 = 3;
        int number9 = 9;
        System.out.println("The Fibonacci number at position " + number + " is " + fibonacciNumber(number));
        System.out.println("The Fibonacci number at position " + number3 + " is " + fibonacciNumber(number3));
        System.out.println("The Fibonacci number at position " + number9 + " is " + fibonacciNumber(number9));
    }
}
