public class User implements Runnable {
    private BankAccount account;
    private String name;

    public User(BankAccount account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            double depositAmount = Math.random() * 100; 
            account.deposit(depositAmount);

            double withdrawAmount = Math.random() * 100; 
            account.withdraw(withdrawAmount);

            System.out.println(name + "'s Balance: " + account.getBalance());

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
