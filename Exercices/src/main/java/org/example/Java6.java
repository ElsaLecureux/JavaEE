package org.example;
public class Java6{
    static int modulo= 0;
    static int divider(int num1, int num2){
        if (num2 == 0) {
            return num1;
        }
        int calculus = num1%num2;
        return divider(num2, calculus);
    }

    public static void main(String[] args) {
        int firstNumber = 12;
        int secondNumber = 24;
        System.out.println(divider(firstNumber, secondNumber));
    }
}
