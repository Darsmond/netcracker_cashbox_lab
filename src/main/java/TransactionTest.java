import java.util.LinkedList;
import java.util.Queue;

public class TransactionTest {

    public static void main(String[] args) {

        Queue<Account> sharedQ = new LinkedList<>();
        Queue<Account> anotherQueue = new LinkedList<>();
        Queue<Account> thirdQueue = new LinkedList<>();

        Account person1 = new Account("Aleksey",1, 40, 205);
        Account person2 = new Account("Arseniy", 2, 25,10);

        Account person3 = new Account("Georgiy", 1, 140, 203);
        Account person4 = new Account("Solohin", 1, 240, 22);

        Account person5 = new Account("Roman",2,150,35);

        Account person6 = new Account("Evgeniy",1, 25,10);

        sharedQ.add(person1);
        sharedQ.add(person2);

        anotherQueue.add(person3);
        anotherQueue.add(person4);

        thirdQueue.add(person6);

        Comparator comparator = new Comparator();
        comparator.compareQueues(person5, sharedQ, anotherQueue, thirdQueue); //calling a Comparator to choose a shortest queue and adding person5 to this queue

        Bank bank = new Bank();

            Thread[] pool = new Thread[3]; //creating a pool of three operators
                pool[0] = new Thread(new MyThread(bank, sharedQ));
                pool[0].start();
                pool[1] = new Thread(new MyThread(bank, anotherQueue));
                pool[1].start();
                pool[2] = new Thread(new MyThread(bank,thirdQueue));
                pool[2].start();
    }
}