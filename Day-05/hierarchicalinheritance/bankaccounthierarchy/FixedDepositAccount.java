package hierarchicalinheritance.bankaccounthierarchy;

//class fixeddepositaccount inherits the class bankaccount
class FixedDepositAccount extends BankAccount {
    int maturityPeriod;
    //constructor
    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }
    //overridden method
    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type Fixed Deposit Account");
        System.out.println("Maturity Period " + maturityPeriod);
    }
}