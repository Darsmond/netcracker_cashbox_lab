public class Account { //Customer class, who comes to bank and want to withdraw or deposit amount of cash to the Cashier
    private String name;
    private int operation; // 1 - deposit, anything else - withdraw
    private int amount;
    private int time;

    public Account(String name, int operation, int amount, int time) {
        this.name = name;
        this.operation = operation;
        this.time = time;
        this.amount = amount;
    }

    public String getName() {
        return this.name;
    }

    public int getOperation() { return this.operation; }

    public int getAmount() {
        return this.amount;
    }

    public int getTime() {
        return this.time;
    }
}