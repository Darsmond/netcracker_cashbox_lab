public class Singleton {
    private String name;
    private static Singleton cashbox = new Singleton();
    private int balance = 1000;

    public Singleton(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public Singleton(){

    }

    public static Singleton getCashbox(){
        return cashbox;
    }
}
