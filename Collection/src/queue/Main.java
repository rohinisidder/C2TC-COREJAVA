package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
			Queue q = new LinkedList();
			for(int i = 0;i<5;i++)
				q.add(i);
			System.out.println(q);
			
			Queue r = new PriorityQueue();
			for(int i = 0;i<5;i++)
				r.add(i);
			System.out.println(r);
			
			
	}
}
