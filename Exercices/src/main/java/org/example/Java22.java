package org.example;

public class Java22 {
    public static class BankAccount{

        String accountNumber;
        int initialBalance;

        public BankAccount(String accountNumber, int initialBalance){
            this.accountNumber = accountNumber;
            this.initialBalance = initialBalance;
        }
       public int deposit(int deposit){
           System.out.println("Deposit " + deposit + " into account " + this.accountNumber);
            return this.initialBalance = this.initialBalance + deposit;
        }

        public int withdraw(int withdrawal){
            System.out.println("Withdraw $" + withdrawal + " from account " + this.accountNumber);
            return this.initialBalance = this.initialBalance - withdrawal;
        }
    }

    public static class SavingsAccount extends BankAccount{
        public SavingsAccount(String accountNumber, int initialBalance) {
            super(accountNumber, initialBalance);
        }

        @Override
        public int withdraw(int withdrawal){
            System.out.println("Try to withdraw $"+ withdrawal + " from " + this.accountNumber + "!");
            if (this.initialBalance - withdrawal > 100) {
                return this.initialBalance = this.initialBalance - withdrawal;
            } else {
                System.out.println("Minimum balance of $100 required!");
                return this.initialBalance;
            }
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccountBA1234 = new BankAccount("BA1234", 500);
        System.out.println("New balance after depositing $" + 1000 + ": $" + bankAccountBA1234.deposit(1000));
        System.out.println("New balance after withdrawing $" + 600 + ": $" + bankAccountBA1234.withdraw(600));

        SavingsAccount savingsAccountSA1234 = new SavingsAccount("SA1234", 450);
        System.out.println("Balance after trying to withdraw $" + 300 + ": $" + savingsAccountSA1234.withdraw(300));

        SavingsAccount savingsAccountSA1000 = new SavingsAccount("SA1000", 300);
        System.out.println("Balance after trying to withdraw $" + 250 + ": $" + savingsAccountSA1234.withdraw(250));
    }
}
