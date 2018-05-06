import java.util.Queue;

public class Comparator {
    public void compareQueues(Account person, Queue... values){
        Queue minimalQueue = values[0];
        for (int i=0; i<values.length; i++){
            for (int j=0; j<values.length; j++)
                if (values[i].size() < minimalQueue.size()) {
                    minimalQueue = values[i];
                }
        }
        minimalQueue.add(person); //adding a person to shortest queue
    }
}
