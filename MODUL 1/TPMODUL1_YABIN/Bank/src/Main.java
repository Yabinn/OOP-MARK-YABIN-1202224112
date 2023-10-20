import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create 3 Account objects
        Account account1 = new Account("John_SI1234", "1234567890");
        Account account2 = new Account("Alice_SI5678", "9876543210");
        Account account3 = new Account("ShortName_Class", "NIM");

        // Deposit and withdraw some money
        account1.deposit(1000);
        account2.deposit(1500);
        account3.deposit(500);
        account1.withdraw(200);

        // Add the accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Remove an account by account number
        bank.removeAccount("9876543210");

        // Get an account by account number
        Account retrievedAccount = bank.getAccount("1234567890");
        if (retrievedAccount != null) {
            System.out.println("Account Name: " + retrievedAccount.getName());
            System.out.println("Account Number: " + retrievedAccount.getAccountNumber());
            System.out.println("Balance: " + retrievedAccount.getBalance());
        }

        // Get a list of all accounts
        List<Account> allAccounts = bank.getAllAccounts();
        System.out.println("All Accounts:");
        for (Account account : allAccounts) {
            System.out.println("Account Name: " + account.getName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
        }
    }
}
