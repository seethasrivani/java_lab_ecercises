package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();
		queue.offer("first");
		queue.offer("second");
		queue.offer("third");
        System.out.println(queue);
		/*
		 * System.out.println(queue.poll()); // Output: first
		 * System.out.println(queue.poll()); 
		 * System.out.println(queue.poll());
		 * System.out.println(queue.poll());//null
		 */ 
		
		/*
		 * System.out.println(queue.remove()); // Output: first
		 * System.out.println(queue.remove()); 
		 * System.out.println(queue.remove());
		 * System.out.println(queue.remove()); //exception
		 */		
        //System.out.println(queue.peek()); // Output: second
	}

}
