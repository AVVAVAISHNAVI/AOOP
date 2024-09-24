
public class BankAccountManagementSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // Initial balance

        Thread user1 = new Thread(new User(account, "User1"));
        Thread user2 = new Thread(new User(account, "User2"));
        Thread user3 = new Thread(new User(account, "User3"));

        user1.start();
        user2.start();
        user3.start();

        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
