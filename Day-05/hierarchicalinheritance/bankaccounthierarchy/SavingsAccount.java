package hierarchicalinheritance.bankaccounthierarchy;

//class savingaccount inherits the class bankaccount
class SavingsAccount extends BankAccount {
    double interestRate;
    //constructor
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    //overridden method
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type Savings Account");
        System.out.println("Interest Rate " + interestRate);
    }
}