public class BankAccount {

    // Static variable
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    // Instance variables
    private String accountHolderName;
    private final int accountNumber;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method to get the total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    // Method to display account details
    public void displayAccountDetails() {
        // Checking if this object is an instance of BankAccount
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        // Creating bank account objects
        BankAccount account1 = new BankAccount("Anubhav Singh", 1001);
        BankAccount account2 = new BankAccount("Deepansh Khare", 1002);
        BankAccount account3 = new BankAccount("Furquan Majeed", 1003);

        // Displaying total accounts
        BankAccount.getTotalAccounts();  // Output: Total accounts: 3

        // Displaying account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();


    }
}
