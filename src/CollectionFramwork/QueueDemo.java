package CollectionFramwork;
import java.util.PriorityQueue;
import java.util.Queue;
	public class QueueDemo {
		    public static void main(String[] args){
		        
		        // Create a PriorityQueue of Integers
		        Queue<Integer> pq = new PriorityQueue<>();
		        
		        // Adding elements to the PriorityQueue
		        pq.add(50);
		        pq.add(20);
		        pq.add(40);
		        pq.add(10);
		        pq.add(30);
		        
		        // Display the PriorityQueue elements
		        System.out.println("PriorityQueue elements: " + pq);
		    }
		}
