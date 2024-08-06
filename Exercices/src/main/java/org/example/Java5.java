package org.example;
public class Java5 {
    static void convertToYearsAndDays(int num) {
        float numbersOfMinutePerYear= 60 * 24 * 365;
        float yearsFloat = num /numbersOfMinutePerYear;
        int years = (int) yearsFloat;
        int days = (int) ((yearsFloat - years)*365);
        System.out.println(num + " minutes approximately equals to " + years + " years  and " + days + " days");
    }
        public static void main(String[] args) {
            int number= 3456789;
            convertToYearsAndDays(number);
    }
}
