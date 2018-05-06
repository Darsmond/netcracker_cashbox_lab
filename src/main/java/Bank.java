public class Bank  {
    private final Singleton cashier = new Singleton("Cashier",1000);

    public synchronized void deposit(Account customer) {
        int amount = customer.getAmount();
        System.out.printf("\n%s\n", "Balance of the Cashier before operation: " + cashier.getBalance());
        cashier.deposit(amount);

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        String message = "%s deposited %d into Cashier. It took %d milliseconds. Now total balance of the Cashier: %d\n";
        System.out.printf(message, customer.getName(), amount, customer.getTime(), cashier.getBalance());
    }

    public synchronized void withdraw(Account customer) {
        int amount = customer.getAmount();
        System.out.printf("\n%s\n", "Balance of the Cashier before operation: " + cashier.getBalance());
        cashier.withdraw(amount);

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        String message = "%s withdrew %d from Cashier. It took %d milliseconds. Now total balance of the Cashier: %d\n";
        System.out.printf(message, customer.getName(), amount, customer.getTime(), cashier.getBalance());
    }
}