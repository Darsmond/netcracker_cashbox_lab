import java.util.Queue;

public class MyThread implements Runnable { //Operator class

    private Bank bank;
    private final Queue<Account> queue;

    MyThread(Bank bank, Queue queue) {
        this.bank = bank;
        this.queue = queue;
    }

    @Override
    public synchronized void run() {
        while (queue.size() >= 1) {
            try {
                if (queue.element().getOperation()==1) {
                    bank.deposit(queue.element());
                } else {
                    bank.withdraw(queue.element());
                }
                    Thread.sleep(queue.element().getTime());
                    queue.remove();
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
        }
    }
}




