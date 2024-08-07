package org.example;

public class Java16 {
    public static class Account{

        public String accountNumber;


       public Double balance;

       public Account(String accountNumber, Double balance){
           if (accountNumber != null && accountNumber.isEmpty()) {
               System.out.println("Error: Account number cannot be null or empty");
           } else if (balance < 0) {
              System.out.println("Error: Balance cannot be negative");
           }
       }
    }

    public static void main(String[] args) {
        Account account = new Account("12340009", 1000.0);
        Account account2 = new Account ("", 25.0);
        Account account3 = new Account ("15342", -253.33);
    }
}
