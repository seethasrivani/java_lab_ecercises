package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer> q=new PriorityQueue<>();
	       System.out.println(q.isEmpty());
	       q.add(2);
	       q.add(4);
	       System.out.println(q.peek());
	       System.out.println(q.element());
	       System.out.println(q.isEmpty());
	       System.out.println(q.size());
	}

}
