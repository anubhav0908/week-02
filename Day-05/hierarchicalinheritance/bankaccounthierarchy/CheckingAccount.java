package hierarchicalinheritance.bankaccounthierarchy;

//class checking account inherits the class bankaccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    //constructor
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    //overridden method
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type Checking Account");
        System.out.println("Withdrawal Limit " + withdrawalLimit);
    }
}