
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        // Create accounts
        Account matthewsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        
        // Print initial state
        System.out.println("Initial state: ");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
        
        // Withdraw 100.0 from Matthews account
        matthewsAccount.withdrawal(100.0);
        
        // Deposit 100.0 to my account
        myAccount.deposit(100.0);
        
        // Print the final state of both accounts
        System.out.println("Final state: ");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
