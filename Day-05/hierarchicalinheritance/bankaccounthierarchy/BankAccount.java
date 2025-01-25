package hierarchicalinheritance.bankaccounthierarchy;

//super class
class BankAccount {
    String accountNumber;
    double balance;
    //constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //method
    void displayAccountType() {
        System.out.println("Account Number " + accountNumber);
        System.out.println("Balance " + balance);
    }
}



