/* From 20.10 on p.792
 * "(Perform set operations on priority queues)
 * Create two priority queues {(...)}{(...)},
 * and find their union, difference, and intersection."
 * 
 *  THOMAS' NOTE | 
 */
import java.util.Arrays;
import java.util.PriorityQueue;
public class Z20 {

    public static void main(String[] args) {

    	PriorityQueue<String> pq1 = new PriorityQueue<>(Arrays.asList("Kevin", "Alan", "Lora", "Edward", "Sark", "Tron", "Crom", "Ram", "Castor"));
    	PriorityQueue<String> pq2 = new PriorityQueue<>(Arrays.asList("Kevin", "Sam", "Quorra", "Alan", "Ed Jr", "Clu 2", "Rinzler", "Zuse"));
        

        PriorityQueue<String> union = new PriorityQueue<>(pq1);
        PriorityQueue<String> tmp = new PriorityQueue<>(pq2);

        String s;
        while ((s = tmp.poll()) != null) {
            if (!union.contains(s)) {
                union.add(s);
            }
        }
        System.out.println("Union set: " + union);

        PriorityQueue<String> difference = new PriorityQueue<>(pq1);
        difference.removeAll(pq2);
        System.out.println("Difference: " + difference);

        PriorityQueue<String> intersection = new PriorityQueue<>(pq1);
        intersection.retainAll(pq2);
        System.out.println("Difference: " + intersection);

    }

}